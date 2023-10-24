package Projet.Tournoi.repository;


import Projet.Tournoi.entity.CelluleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface CelulleRepo extends JpaRepository<CelluleEntity, Long> {


}
