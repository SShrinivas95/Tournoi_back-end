package Projet.Tournoi.exeception;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CharacterNotFoundListException extends RuntimeException {

    public CharacterNotFoundListException (String message){
        super(message);
    }
}
