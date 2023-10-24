package Projet.Tournoi.dto;


import Projet.Tournoi.entity.CharacterEntity;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Cellule {

    private Long celluleId;
    private Integer vote;

    private Set<Character> listOfCharacter = new HashSet<>();

    private Integer totalPeople;

    private LocalDate dateBegin;

    private LocalDate dateFinish;

    public Cellule(Long celluleId, Set<Character> listOfCharacter, Integer totalPeople) {
        this.celluleId = celluleId;
        this.listOfCharacter = listOfCharacter;
        this.totalPeople = totalPeople;
    }

// TODO Gagnant cellule

}
