package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("JCollections");
//        utworzenie pustej listy
        List<String> fruits = new ArrayList<>();
        // sprawdzanie rozmiaru listy
        System.out.println(fruits.size());
        //dodawanie do listy
        fruits.add("Jabłko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Ogórek");
        fruits.add("Mandarynka");
        //
        fruits.add(1,"Mango");
        //wypisanie zawartosci tablicy
        System.out.println(fruits);
        // wyrazenie lambda
        fruits.forEach(f-> System.out.println(f));
        // to samo
        System.out.println("For each");
        for (String f : fruits){
            System.out.println(f);
        }
        // modyfikacja wartosci w liscie
        fruits.set(1, "Kaka");
        // odczytanie wartosci w podanym indeksie
        System.out.println(fruits.get(1));
        System.out.println(fruits);
        // usówanie wartości
        fruits.remove("Gruszka");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.get(0));

        // Inicjalizacja listy wartosciami początkowymi
        List<String> brands = new ArrayList<>(Arrays.asList("BMW","Audi","VW","Toyota"));
        brands.add("Porsche");
        System.out.println(brands);
    }
}
