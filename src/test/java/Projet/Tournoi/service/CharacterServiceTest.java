package Projet.Tournoi.service;

import Projet.Tournoi.repository.CharacterRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import Projet.Tournoi.dto.Character;

import java.util.List;
import java.util.stream.Collectors;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CharacterServiceTest {

    @Mock
    private CharacterRepoService characterRepoService ;

    private CharacterRepository characterRepooo ;

    @InjectMocks
    private CharacterService characterService ;

    @Test
   void addCharacter() {
//        //given
//        Character character = new Character(0L,"test") ;
//        //when
//        characterService.addCharacter(character);
//        //then
//        verify(characterRepoService).save(any(CharacterEntity.class));
  }

    @Test
    void showAllCharacter() {
        //given
//        List<CharacterEntity> listTest = Arrays.asList(new CharacterEntity(0L,"la")
//                , new CharacterEntity(1212L,"menteur")
//                , new CharacterEntity(848L,"etrepris"));
        //when
        //when(characterRepoService.findAll()).thenReturn(listTest);
//        List<Character> characterList = characterService.showAllCharacter();
//        //then
//        verify(characterRepoService).findAll() ;
////        List <Character> listVerifie = Arrays.asList(
////                 new Character (5,"la")
////                , new Character(1212,"bahnan")
////                , new Character(848,"etrepris"));
//
////        List<String> nameVrai = listVerifie.stream()
////                        .map(Character::getNom)
////                                .collect(Collectors.toList());
//
//        List<String> aVerifier= characterList.stream()
//                .map(Character::getNom)
//                .collect(Collectors.toList());

//        assertNotEquals(aVerifier,nameVrai);
    }

    @Test
    void deleteCharacterServiceMain() {
//        //given
//        Character character = new Character(5l,"Lobo");
//        //when
//        doNothing().when(characterRepoService).deleteById(character.getId());
//
//
//        //then
//        verify(characterRepoService).deleteById(character.getId());
//

    }

    @Test
    void deleteCharacter() {
        //given
////        CharacterEntity test = new CharacterEntity(30l,"bOD");
//        when(characterRepooo.existsById(test.getId())).thenReturn(true);
//        //when
//        characterRepoService.deleteById(test.getId());
//        //then
//        verify(characterRepooo).deleteById(test.getId());
    }

    @Test
    void deleteCharacterNotFound() {
//        //given
//        CharacterEntity test = new CharacterEntity(30l,"bOD");
//        when(characterRepooo.existsById(test.getId())).thenReturn(false);
//        //when ( verifier qu'il leve une exception)
//        CharacterNotFoundException characterNotFoundException =  assertThrows(
//                CharacterNotFoundException.class,
//                () -> characterRepoService.deleteById(test.getId())
//        );
//        //then
//        verify(characterRepooo, never()).deleteById(test.getId());
//
//        String expectedMessage = String.format("No Character was found with ID: %s", test.getId());
    //        String actualMessage = characterNotFoundException.getMessage();
    //        assert(actualMessage).contains(expectedMessage);
        }



}