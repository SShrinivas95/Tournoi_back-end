package Projet.Tournoi.utils;

import Projet.Tournoi.entity.CharacterEntity;

import Projet.Tournoi.dto.Character;
import lombok.experimental.UtilityClass;

import java.util.function.Function;

@UtilityClass
public class AppUtils {

    public static final Function <Character, CharacterEntity> characterToCharacterEntity =
            (character) -> CharacterEntity
                    .builder()
                    .nom(character.getNom())
                    .build();

    public static final Function <CharacterEntity,Character> characterEntityTocharacter =
            (characterEntity) -> Character
                    .builder()
                    .id(characterEntity.getId())
                    .nom(characterEntity.getNom())
                    .build();


}
