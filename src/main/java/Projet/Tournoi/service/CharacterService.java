package Projet.Tournoi.service;

import Projet.Tournoi.dto.Character;
import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.exeception.CharacterNotFoundListException;
import Projet.Tournoi.utils.AppUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CharacterService {

    private final CharacterRepoService characterRepoService;

    @Autowired
    public CharacterService(CharacterRepoService characterRepoService) {
        this.characterRepoService = characterRepoService;
    }

    public Character addCharacter(Character character) {
        characterRepoService.save(AppUtils.characterToCharacterEntity.apply(character));
        return character;
    }

    public List<Character> showAllCharacter() {
        List<CharacterEntity> characterEntityList = characterRepoService.findAll();
        if(characterEntityList.isEmpty()) throw new CharacterNotFoundListException("List Not Found");

        return characterEntityList.stream()
                .map(AppUtils.characterEntityTocharacter)
                .collect(Collectors.toList());
    }

    public void addCharacterList(List<Character> liste) {
        characterRepoService.saveList(liste.stream()
                .map(AppUtils.characterToCharacterEntity::apply).collect(Collectors.toList()));
        log.info("List was saved: {}", liste);
    }

    public void deleteCharacter(Long id) {
        characterRepoService.deleteById(id);
    }


}
