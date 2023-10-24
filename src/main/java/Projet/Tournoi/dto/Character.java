package Projet.Tournoi.dto;

import Projet.Tournoi.entity.CelluleEntity;
import lombok.*;
import org.springframework.data.annotation.Id;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Character implements Serializable {


    private Long characterId ;

    private Set<Cellule> listOfCelulle;

    private String nom ;

    private String imageUrl;

    private Integer vote;


}
