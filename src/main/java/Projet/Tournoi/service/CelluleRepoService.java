package Projet.Tournoi.service;

import Projet.Tournoi.dto.Cellule;
import Projet.Tournoi.entity.CelluleEntity;
import Projet.Tournoi.repository.CelulleRepo;
import Projet.Tournoi.utils.AppUtils;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Service
public class CelluleRepoService {

    private final CelulleRepo celluleRepo;

    @Autowired
    public CelluleRepoService(CelulleRepo celluleRepo) {
        this.celluleRepo = celluleRepo;
    }

    public void saveCelluleList (List<Cellule> celluleList){
        celluleRepo.saveAll(celluleList
                .stream()
                .map(AppUtils.celluleToCelluleEntity)
                .collect(Collectors.toList()));
    }

    public List<CelluleEntity> getListCelulle(){
        return celluleRepo.findAll();
    }


}
