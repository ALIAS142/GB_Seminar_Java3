import java.awt.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Задача 1. Заполнить список названиями планет Молнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество повторений в списке.
public class Task01 {

    public static void main(String[] args) {

        ArrayList<String> Planets = new ArrayList<>(Arrays.asList("Earth", "Earth", "Mars", "Jupiter", "Earth"));

        System.out.println(Planets);


        Map<String, Long> frequency = Planets.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}