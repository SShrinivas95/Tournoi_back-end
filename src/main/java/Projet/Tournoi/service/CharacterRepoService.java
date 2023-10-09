package Projet.Tournoi.service;

import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.exeception.CharacterNotFoundException;
import Projet.Tournoi.exeception.CharacterNotFoundListException;
import Projet.Tournoi.repository.CharacterRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@FieldDefaults(level= AccessLevel.PRIVATE)
@Service
public class CharacterRepoService {

    private final CharacterRepository characterRepo;

    @Autowired
    public CharacterRepoService(CharacterRepository characterRepository) {
        this.characterRepo = characterRepository;
    }

    public void save(CharacterEntity characterEntity) {
        characterRepo.save(characterEntity);
    }

    public List<CharacterEntity> findAll() {
        return characterRepo.findAll();
    }

    public void deleteById(Long id) {

        characterRepo.deleteById(id);
    }

    public void saveList(List<CharacterEntity> listCharacter) {
        characterRepo.saveAll(listCharacter);
    }

}
