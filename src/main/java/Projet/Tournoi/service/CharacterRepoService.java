package Projet.Tournoi.service;

import Projet.Tournoi.entity.CelluleEntity;
import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.repository.CelulleRepo;
import Projet.Tournoi.repository.CharacterRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Service
public class CharacterRepoService {

    private final CharacterRepository characterRepo;
    private final CelulleRepo celulleRepo;

    @Autowired
    public CharacterRepoService(CharacterRepository characterRepository, CelulleRepo celulleRepo) {
        this.characterRepo = characterRepository;
        this.celulleRepo = celulleRepo;
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

    public void saveCellule(CelluleEntity celluleEntity) {
        celulleRepo.save(celluleEntity);
    }

}
