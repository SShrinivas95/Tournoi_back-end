package Projet.Tournoi.service;

import Projet.Tournoi.dto.Character;
import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.repository.CharacterRepository;
import Projet.Tournoi.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    private final CharacterRepoService characterRepoService;
    @Autowired
    public CharacterService(CharacterRepoService characterRepoService) {
        this.characterRepoService = characterRepoService;
    }

    public Character addCharacter(Character character) {
        if(Objects.isNull(character)) throw new RuntimeException("pas de character");
        characterRepoService.save(AppUtils.characterToCharacterEntity.apply(character));
        return character;
    }

    public List<Character> showAllCharacter() {
        List<CharacterEntity> characterEntityList = characterRepoService.findAll();
        return characterEntityList
                .stream()
                .map(AppUtils.characterEntityTocharacter)
                .collect(Collectors.toList());
    }

    public void deleteCharacter(Long id) {
        characterRepoService.deleteById(id);
    }


}
