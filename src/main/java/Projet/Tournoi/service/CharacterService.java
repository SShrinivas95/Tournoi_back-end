package Projet.Tournoi.service;

import Projet.Tournoi.dto.Cellule;
import Projet.Tournoi.dto.Character;
import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.exeception.CharacterNotFoundListException;
import Projet.Tournoi.utils.AppUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class CharacterService {

    private final CharacterRepoService characterRepoService;
    private final CelluleService celluleService;
    @Autowired
    public CharacterService(CharacterRepoService characterRepoService, CelluleService celluleService) {
        this.characterRepoService = characterRepoService;
        this.celluleService = celluleService;
    }

    public Character addCharacter(Character character) {
        characterRepoService.save(AppUtils.characterToCharacterEntity.apply(character));
        return character;
    }

    public List<Cellule> showAllCelluleWithCharacter() {
        return celluleService.showAllCellule();

    }

    public void addCharacterInEachCellule(List<Character> liste) {
        celluleService.distributionOfPlayer(liste);

    }

    public void deleteCharacter(Long id) {
        characterRepoService.deleteById(id);
    }



}
