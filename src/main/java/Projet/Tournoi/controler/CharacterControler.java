package Projet.Tournoi.controler;

import Projet.Tournoi.dto.Cellule;
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
        public ResponseEntity<List<Cellule>> getAllCellule() {
            List<Cellule> celluleList= characterService.showAllCelluleWithCharacter();
            return new ResponseEntity<>(celluleList, HttpStatus.OK);
        }

    @PostMapping("/put")
    public ResponseEntity newCharatere(@RequestBody Character character) {
        characterService.addCharacter(character);
        return ResponseEntity.ok().body(character);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCharater(@PathVariable("id") Long id){
          characterService.deleteCharacter(id);
        return ResponseEntity.ok().body("Character is deleted");
    }
    @PostMapping("/putAll")
    public ResponseEntity<List<Character>> saveAllCharacterInCellule(@RequestBody List <Character> character) {
        characterService.addCharacterInEachCellule(character);
        return ResponseEntity.ok().body(character);
    }

}
