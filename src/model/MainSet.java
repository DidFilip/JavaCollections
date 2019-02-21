package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        //deklaracja zbioru
        Set<String> pesels = new HashSet<>();
        Set<String> pesels_bydgoszcz = new HashSet<>(Arrays.asList("2222","3333","2343","4567"));
        //dodawanie wartosci do zbioru
        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println("Dodano? " + pesels.add("2345"));
        System.out.println("Dodano? " + pesels.add("7491"));
        System.out.println("Dodano? " + pesels.add("2950"));
        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println(pesels);
        // sprawdzanie przynależnosci do zbioru
        System.out.println("Przynależy: " + pesels.contains("1234"));
        System.out.println("Przynależy: " + pesels.contains("6666"));
        // usuniecie wartosci ze zbioru
        pesels.remove("1234");
        System.out.println(pesels);
        // suma zbiorów
        Set<String> temp = new HashSet<>();
        temp.addAll(pesels);
        temp.addAll(pesels_bydgoszcz);
        System.out.println("Po sumowaniu "+ pesels + " + " + pesels_bydgoszcz + " = " + temp);
        // róznica zbiorów
        temp.clear();
        temp.addAll(pesels);
        temp.removeAll(pesels_bydgoszcz);
        System.out.println("Po różnicy: " + pesels + " - " + pesels_bydgoszcz + " = " + temp);
        //czesc wspólna
        temp.clear();
        temp.addAll(pesels);
        temp.addAll(pesels_bydgoszcz);
        System.out.println("Po cześci wspólnej: " + pesels + " x " + pesels_bydgoszcz + " = " + temp);
    }
}
