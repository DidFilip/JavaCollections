import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        //deklaracja mapy
        Map<String, Double> eq_prices = new HashMap<>();
        //dodanie watosci do mapy
        eq_prices.put("Tapicerka skórzana", 7000.);
        eq_prices.put("Klimatyzacja dwustrefowa", 2550.);
        eq_prices.put("Automatyczna skrzynia biegów", 10000.);
        eq_prices.put("Lakier perłowy", 3000.);
        //wypisanie elementów mapy
        System.out.println(eq_prices);
        //modyfikacja wartosci
        eq_prices.put("Lakier perłowy", 3500.);
        System.out.println(eq_prices);
        // rozmiar mapy
        System.out.println(eq_prices.size());
        //sprawdzanie wystepowania kluczy
        System.out.println(eq_prices.keySet());
        System.out.println(eq_prices.keySet().contains("Tapicerka skórzana"));
        System.out.println(eq_prices.keySet().contains("Tapicerka welurowa"));
        // sprawdzanie wartosci w mapie
        System.out.println(eq_prices.values());

        for(Map.Entry<String, Double> eq : eq_prices.entrySet()){
            System.out.println(eq.getKey() +" "+eq.getValue());
        }
        // usunięcie wartosci z mapy
        eq_prices.remove("Lakier perłowy");
        System.out.println(eq_prices);

        //sumowanie wartosci
        double sum = 0;
        for(Map.Entry<String, Double> eq : eq_prices.entrySet()) {
            // sum = sum + eq.getValue
            sum += eq.getValue();
        }
        System.out.println("Suma za full opcję: " + sum);



    }
}
