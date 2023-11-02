package Projet.Tournoi.entity;

import Projet.Tournoi.dto.Character;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Entity
@Table(name="Cellule")
public class CelluleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long celluleId ;
    @Column(nullable = true)
    private Integer vote ;

    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name = "CELLULE_CHARACTER_TABLE",
    joinColumns = {
            @JoinColumn(name="cellule_Id",referencedColumnName = "celluleId"),
    },
            inverseJoinColumns = {
            @JoinColumn(name = "character_Id",referencedColumnName = "characterId")
            })
    private Set <CharacterEntity> listOfCharacter= new HashSet<>();

    @Column
    private Integer totalPeople;
    @Column
    private LocalDate dateBegin;
    @Column
    private LocalDate dateFinish;

    // TODO ID unique
    // TODO Gagnant cellule

}
