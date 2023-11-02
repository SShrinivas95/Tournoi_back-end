package Projet.Tournoi;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.stream;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.ArgumentUtils.toCharArray;


class ProjetTournoiApplicationTests {

    static Boolean existeLettre(String letter, String test) {
        char taber [] = letter.toCharArray();
        char taberr [] = test.toCharArray();

        Arrays.sort(taberr);
        Arrays.sort(taber);

        return Arrays.equals(taberr,taber);
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

//        int tabe[] = {-9, 8, -6, 7, -3};
//        List<Integer> taaa = new ArrayList<>(Arrays.asList(-9, 8, -6, 7, -3));
//        int proche= 100;
//        int valeur = 0;
//        for(int i =0;i<100;i++){
//            proche--;
//            if(taaa.contains(proche))
//            {
//                valeur=proche;
//                break;
//            }
//        }
//        System.out.println(valeur);

//        String j ="add";
//        String ii ="dda" ;
//        String iii = "daa";
//        int valeir = 0;
//        boolean a = true;
//        for (int i =0 ; i<j.length(); i++){
//            if(j.charAt(i) != ii.charAt(ii.length()-1-i)) {
//                a = false;
//                break;
//            }
//        }
//       System.out.println(a);
//
//        String name = "Je suis tropppppp guez";
//        String t [] = name.split(" ");
//        String c = t[0];
//        for(String x : t){
//            if(x.length() > c.length()){
//                c=x;
//            }
//        }
//        System.out.println(a);
//        int fixe = 471;
//        int fixe2 =480;
//        int centaine2 = fixe2/100;
//        int dizaine2 = (fixe2/10)%10;
//        int unit2 =fixe2 %10;
//        int centaine = fixe/100;
//        int dizaine = (fixe/10)%10;
//        int unit =fixe %10;
//
//
//        int valeur1 = fixe + centaine + dizaine + unit ;
//        int valeur2 = fixe2 + centaine2 + dizaine2 + unit2 ;
//
//        while (valeur1 != valeur2){
//
//            valeur2 = valeur2 +centaine2 + dizaine2 + unit2;
//            centaine2 = valeur1 /100 ;
//            dizaine2 = (valeur1/10)%10;
//            unit2 =valeur1 %10;
//
//            valeur1 = valeur1 +centaine + dizaine + unit;
//            centaine = valeur1 /100 ;
//            dizaine = (valeur1/10)%10;
//            unit =valeur1 %10;
//
//        }



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
//
//        String nom = "test" ;
//
//
//        System.out.println(existeLettre('e',"test"));
//
//        List <Integer> num = new ArrayList<>();
//
//        num.add(20);
//        num.add(50);
//        num.add(30);
//        num.add(10);
//        num.add(90);
//
//        Iterator<Integer> it = num.iterator();
//        num.forEach(System.out::println);
//        int test[] = new int[num.size()];
//        for (int i = 0; i < num.size(); i++) {
//            while (it.hasNext()) {
//                test[i]=it.next();
//                System.out.println(test[i]);
//            }
//        }

//        List <Integer> Test = new ArrayList<>();
//        Test.add(5);
//        Test.add(2);
//        Test.add(5);
//        Test.add(5);
//        Test.add(57);
//
//        Collections.sort(Test);
//        System.out.println(Test);
//
//        Set<Integer> ma = new HashSet<>();
//
//        ma.addAll(Test);
//
//       System.out.println(ma);
//
//        String [] tab  = {"test","la","ah"};
//
//        System.out.println(tab[0]);

//        String loboomie ="loboomtie";
//        String lobotomie= "lobotomi";
//        String azerty="azerty";
//        String ytreza="ytreza";
//
//        int tab []= new int [5];
//        List<Character> l1 = new ArrayList<>();
//        List<Character> l2 = new ArrayList<>();
//        azerty.chars().forEach(lettre -> {
//            char l = (char) lettre;
//            l1.add(l);
//        });
//        ytreza.chars().forEach(lettre -> {
//            char l = (char) lettre;
//            l2.add(l);
//        });
//
//        l1.sort(Character::compareTo);
//        l2.sort(Character::compareTo);
//        System.out.println(l1.equals(l2));
//        Scanner it = new Scanner(System.in);
//        String nomm ="add";
//        String nomInverse = "ddy";
//        boolean tu = true;
//        for(int i =0; nomm.length() > i;i++){
//            if(nomm.charAt(i) != nomInverse.charAt(nomInverse.length() - 1 - i)){
//               tu = false;
//               break ;
//            }
//        }
//        System.out.println(tu);

//        Map<Character,Integer> Voyelle = new HashMap<>();

//        System.out.println("Donnez un nom");
//        String value =it.nextLine().toLowerCase();
//
//        for(int i = 0; i< value.length();i++){
//            if(Voyelle.containsKey(value.charAt(i))){
//                Voyelle.put(value.charAt(i), Voyelle.get(value.charAt(i)) + 1);
//            }else {
//                Voyelle.put(value.charAt(i),1);
//            }
//        }
//
//            Voyelle.forEach((key,val)->System.out.println(key+ "="+ val));
//
//        String mot[]= {"bb","aeouiy","beau","mignon"};
//        String message = "ae";
//        List<String> listOfWord = new ArrayList<>();
//
//        for(String word : mot) {
//            boolean contans = false;
//            for (int i = 0; i < word.length(); i++) {
//                for (int j = 0; j < message.length(); j++) {
//                    if (word.charAt(i) == message.charAt(j)) {
//                        contans = true;
//                        break;
//                    }
//                }
//                if (contans) {
//                    listOfWord.add(word);
//                    break;
//
//                }
//            }
//        }
//        String aRendre[] = new String[listOfWord.size()];
//        listOfWord.toArray(aRendre);
//
//
//        for(String ma : aRendre){
//            System.out.println(ma);
//        }
//

        List<Integer> test = new ArrayList<>();
        int [] tab= {7,8,18,19,15,15,15,15,15,15,15,15,15,56,56,56,56,56,56,2};
        for(int i = 0 ;i<tab.length;i++){
            if(!test.contains(tab[i])){
                test.add(tab[i]);
            }
        }
        int tt[]=new int [test.size()];
        for(int j=0;j<tt.length;j++){
            tt[j]=test.get(j);
        }

        for(int f : tt) {
            System.out.println(f);
        }

    }

}
