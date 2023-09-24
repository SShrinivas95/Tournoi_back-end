package Projet.Tournoi.controler;

import Projet.Tournoi.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Projet.Tournoi.dto.Character;
import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterControler {

    private final CharacterService characterService;

    @Autowired
    public CharacterControler(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Character>> getAllCharacter() {
        List<Character> characterList= characterService.showAllCharacter();
        return new ResponseEntity<>(characterList, HttpStatus.OK);
    }

    @PostMapping("/put")
    public ResponseEntity newCharatere(@RequestBody Character character) {
        characterService.addCharacter(character);
        return ResponseEntity.ok().body("The character was send");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCharater(@PathVariable("id") Long id){
        characterService.deleteCharacter(id);
        return ResponseEntity.ok().body("Charater is deleted");
    }


}
