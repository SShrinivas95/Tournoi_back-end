package Projet.Tournoi.dto;

import lombok.*;
import org.springframework.data.annotation.Id;


import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Character implements Serializable {
    @Id
    private Long id ;
    private String nom ;




}
