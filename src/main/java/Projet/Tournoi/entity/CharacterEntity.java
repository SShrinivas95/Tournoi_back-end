package Projet.Tournoi.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Entity
@Table(name="Character")
public class CharacterEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long characterId ;

    @ManyToMany(mappedBy = "listOfCharacter")
    private Set<CelluleEntity> listOfCelulle;

    private String nom ;
    @Column
    private String imageUrl;
    @Column
    private Integer vote;


}