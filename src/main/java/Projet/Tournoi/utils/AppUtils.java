package Projet.Tournoi.utils;

import Projet.Tournoi.dto.Cellule;
import Projet.Tournoi.entity.CelluleEntity;
import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.dto.Character;
import lombok.experimental.UtilityClass;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


@UtilityClass
public class AppUtils {


    public static final Function<Character, CharacterEntity> characterToCharacterEntity =
            (character) -> CharacterEntity
                    .builder()
                    .nom(character.getNom())
                    .listOfCelulle(AppUtils.setCelluleToSetCelluleEntity.apply(character.getListOfCelulle()))
                    .vote(character.getVote())
                    .imageUrl(character.getImageUrl())
                    .build();

    public static final Function<CharacterEntity, Character> characterEntityTocharacter =
            (characterEntity) -> Character
                    .builder()
                    .characterId(characterEntity.getCharacterId())
                    .listOfCelulle(AppUtils.setCelluleEntityToSetCellule.apply(characterEntity.getListOfCelulle()))
                    .nom(characterEntity.getNom())
                    .vote(characterEntity.getVote())
                    .imageUrl(characterEntity.getImageUrl())
                    .build();

    public static final Function<CelluleEntity, Cellule> celluleEntityToCellule =
            (CelluleEntity) -> Cellule
                    .builder()
                    .celluleId(CelluleEntity.getCelluleId())
                    .vote(CelluleEntity.getVote())
                    .listOfCharacter(AppUtils.setCharacterEntityToSetCharacter.apply(CelluleEntity.getListOfCharacter()))
                    .totalPeople(CelluleEntity.getTotalPeople())
                    .dateFinish(CelluleEntity.getDateFinish())
                    .dateBegin(CelluleEntity.getDateBegin())
                    .build();


    public static final Function<Cellule,CelluleEntity> celluleToCelluleEntity =
            (Cellule) -> CelluleEntity
                    .builder()
                    .celluleId(Cellule.getCelluleId())
                    .vote(Cellule.getVote())
                    .listOfCharacter(AppUtils.setCharacterToSetCharacterEntity.apply(Cellule.getListOfCharacter()))
                    .totalPeople(Cellule.getTotalPeople())
                    .dateFinish(Cellule.getDateFinish())
                    .dateBegin(Cellule.getDateBegin())
                    .build();


    public static final Function<Set<Character>, Set< CharacterEntity>> setCharacterToSetCharacterEntity =
            (character) -> character.stream()
                    .map(charac -> CharacterEntity.builder()
                            .characterId(charac.getCharacterId())
                            .nom(charac.getNom())
                            .imageUrl(charac.getImageUrl())
                            .vote(charac.getVote())
                            .build())
                    .collect(Collectors.toSet());

    public static final Function<Set<CharacterEntity>, Set< Character>> setCharacterEntityToSetCharacter =
            (character) -> character.stream()
                    .map(charac -> Character.builder()
                            .characterId(charac.getCharacterId())
                            .nom(charac.getNom())
                            .imageUrl(charac.getImageUrl())
                            .vote(charac.getVote())
                            .build())
                    .collect(Collectors.toSet());

    public static final Function<Set<Cellule>, Set< CelluleEntity>> setCelluleToSetCelluleEntity =
            (cellule) -> cellule.stream()
                    .map(cell -> CelluleEntity.builder()
                            .celluleId(cell.getCelluleId())
                            .vote(cell.getVote())
                            .totalPeople(cell.getTotalPeople())
                            .dateBegin(cell.getDateBegin())
                            .dateFinish(cell.getDateFinish())
                            .build())
                    .collect(Collectors.toSet());

    public static final Function<Set<CelluleEntity>, Set< Cellule>> setCelluleEntityToSetCellule =
            (cellule) -> cellule.stream()
                    .map(cell -> Cellule.builder()
                            .celluleId(cell.getCelluleId())
                            .vote(cell.getVote())
                            .totalPeople(cell.getTotalPeople())
                            .dateBegin(cell.getDateBegin())
                            .dateFinish(cell.getDateFinish())
                            .build())
                    .collect(Collectors.toSet());

}
