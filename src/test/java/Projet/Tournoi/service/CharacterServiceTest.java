package Projet.Tournoi.service;

import Projet.Tournoi.entity.CharacterEntity;
import Projet.Tournoi.repository.CharacterRepository;
import Projet.Tournoi.utils.AppUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import Projet.Tournoi.dto.Character;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CharacterServiceTest {

    @Mock
    private CharacterRepoService characterRepoService ;
    private CharacterService characterService ;

    @BeforeEach
    void setUp() {
            characterService = new CharacterService(characterRepoService) ;
    }

    @Test
    void addCharacter() {
        //given
        Character character = new Character(0L,"test") ;
        //when
        characterService.addCharacter(character);
        //then
        verify(characterRepoService).save(any(CharacterEntity.class));
    }

    @Test
    void showAllCharacter() {
        //given
        List<CharacterEntity> listTest = Arrays.asList(new CharacterEntity(0L,"la")
                , new CharacterEntity(1212L,"menteur")
                , new CharacterEntity(848L,"etrepris"));
        //when
        when(characterRepoService.findAll()).thenReturn(listTest);
        List<Character> characterList = characterService.showAllCharacter();
        //then
        verify(characterRepoService).findAll() ;
        List <Character> listVerifie = Arrays.asList(
                 new Character (0L,"la")
                , new Character(1212L,"bahnan")
                , new Character(848L,"etrepris"));

        List<String> nameVrai = listVerifie.stream()
                        .map(Character::getNom)
                                .collect(Collectors.toList());

        List<String> aVerifier= characterList.stream()
                .map(Character::getNom)
                .collect(Collectors.toList());

        assertNotEquals(aVerifier,nameVrai);
    }

    @Test
    void deleteCharacter() {
        //given
        Character test = new Character(30l,"bOD");
        //when
        characterService.deleteCharacter(test.getId());
        //then
        verify(characterRepoService).deleteById(test.getId());

    }
}