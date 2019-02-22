import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {

        // deklaracja kolejki
        Queue<LocalTime> times = new ArrayDeque<>();
        // dodawanie wartosci do kolejki jednokierunkowej
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.of(12, 00, 00));
        //odczytywanie wartości z kolejki
        System.out.println(times);
        // usuwanie i zwracanie elementow z kolejki
        System.out.println("Usunięcie najstarszego elementu z kolejki: " + times.remove());
        System.out.println(times);
        // ---------------------------------------
        // kolejka dwukierunkowa
        Deque<String> people = new ArrayDeque<>();
        //dodawanie elementów
        people.addFirst("Anna");
        people.addLast("Ewa");
        people.addLast("Jan");
        people.addFirst("Mateusz");
        people.addFirst("Ola");
        people.addLast("Iza");
        people.addFirst("Janusz");
        System.out.println(people);
        System.out.println("Pętla while!!!");

//        try {
//
//            while (people.getLast() != null) {
//                System.out.println(people.removeLast());
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("Koniec kolejki");
//        }
        System.out.println("Pętla while v2!!!");
        while(people.size() !=0){
            System.out.println(people.removeFirst());
        }

    }
}
