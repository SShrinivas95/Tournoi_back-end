package Projet.Tournoi.service;

import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.exeception.CharacterNotFoundException;
import Projet.Tournoi.repository.CharacterRepository;
import Projet.Tournoi.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<CharacterEntity> findAll () {
        return characterRepo.findAll();
    }
    public void deleteById(Long id) {
        if(!characterRepo.existsById(id)) throw new CharacterNotFoundException(String.format("No Character was found with ID: %s", id)) ;
        characterRepo.deleteById(id);

    }

}
