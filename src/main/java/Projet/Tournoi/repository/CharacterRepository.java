package Projet.Tournoi.repository;

import Projet.Tournoi.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CharacterRepository extends JpaRepository<CharacterEntity,Long> {


}
