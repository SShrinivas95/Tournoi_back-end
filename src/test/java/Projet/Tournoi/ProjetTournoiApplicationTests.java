package Projet.Tournoi;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


class ProjetTournoiApplicationTests {

    static boolean existeLettre (char letter, String test) {
        boolean num = false;
        for (int i = 0; i < test.length(); i++) {
            num = letter == test.charAt(i) ? true : false ;
            if(num) break;
        }
        return num ;
    }
    public static void main(String[] args) {

//		String test = "LoboGoss" ;
//		String res ="";
//
//	for (int i=1 ; i <= test.length() ; i=i+1 ){
//		int ii = test.length() - i ;
//		res = res + test.charAt(ii) ;
//	}
//
//	System.out.println(res);
//	}

//        int tab[] = {1, 8, 6, 7, 3};
//        List<Integer> nume = new ArrayList<>();
//        for (int i = 0; i < tab.length; i++) {
//            nume.add(tab[i]);
//        }
////        nume = nume.stream().sorted().collect(Collectors.toList());
//        nume = nume.stream().sorted(Integer::compare).collect(Collectors.toList());
//		nume.forEach(System.out::println);
//        int max = tab[2];
//        for (int i = 0; i <tab.length; i++) {
//            if (max < tab[i]) max = tab[i];
//        }
//        System.out.println(max);

//        List<String> liste = new ArrayList<>();
//        List<String> inverse = new ArrayList<>();
//        liste.add("PHP");
//        liste.add("C++");
//        liste.add("Java");
//        liste.add("Python");
//
//        for (String i : liste) {
//            inverse.add(0, i);
//        }
//        inverse.forEach(System.out::println);
//
//        boolean test = liste.contains("ah") ? true : false;
//        System.out.println(test);
//        Collections.sort(liste);
//        liste.forEach(System.out::println);
//        liste.stream().filter(t -> t.startsWith("P")).forEach(System.out::println);

        String nom = "test" ;


        System.out.println(existeLettre('e',"test"));








    }





}