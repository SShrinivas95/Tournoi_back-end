package Projet.Tournoi.service;

import Projet.Tournoi.dto.Cellule;
import Projet.Tournoi.dto.Character;
import Projet.Tournoi.entity.CelluleEntity;
import Projet.Tournoi.exeception.CharacterNotFoundListException;
import Projet.Tournoi.repository.CelulleRepo;

import Projet.Tournoi.service.CharacterRepoService;
import Projet.Tournoi.utils.AppUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Slf4j
public class CelluleService {

    private final CharacterRepoService characterRepoService;
    private final CelulleRepo celulleRepo;

    @Value("6")
    int maxCellule;

    @Value("2")
    int characterInCellule;

    @Autowired
    public CelluleService(CharacterRepoService characterRepoService, CelulleRepo celulleRepo) {
        this.characterRepoService = characterRepoService;
        this.celulleRepo = celulleRepo;
    }

   public List <Cellule> showAllCellule (){
        return celulleRepo.findAll().stream()
                .map(AppUtils.celluleEntityToCellule)
                .collect(Collectors.toList());
    }

    public void distributionOfPlayer(List<Character> characterList) {
        List<CelluleEntity> celulleRepoAll= celulleRepo.findAll();
        celulleRepo.saveAll(celulleRepoAll.stream().map(t->{t.setTotalPeople(0);
            return t ;}).collect(Collectors.toList()));
        IntStream.range(0, characterList.size() - 1)
                .filter(i -> i % 2 == 0)
                .forEach(i -> {
                    Long freePlace = freeCellule().longValue();
                    Set<Character> characters =new HashSet<>(characterInCellule);
                    characters.add(characterList.get(i));
                    characters.add(characterList.get(i+1));
                    Cellule cellule = new Cellule(freePlace,characters, 2);

                    characterRepoService.saveCellule(AppUtils.celluleToCelluleEntity.apply(cellule));

                });

    }

    public Integer freeCellule() {
        List<Integer> celulles = celulleRepo.findAll()
                .stream()
                .filter(t -> t.getTotalPeople() != 2)
                .map(v -> v.getCelluleId().intValue())
                .collect(Collectors.toList());

        return IntStream.range(0, maxCellule + 1)
                .filter(celulles::contains)
                .findFirst()
                .orElseThrow(() -> new CharacterNotFoundListException("List Complete"));

    }


}
