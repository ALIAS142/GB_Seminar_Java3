public class Main {
    public static void main(String[] args) {

        int[] marks = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Ученик №%d: оценка %d%n", (i + 1), marks[i]);
        }

    }
}

//2 пример:
//        int[] marks = {5, 3, 4};
//        String[] names = {"Вася", "Петя", "Маша"};
//
//        for (int i = 0; i < marks.length; i++) {
//        System.out.printf("%s получает оценку %d%n", names[i], marks[i]);
//        }

//Разные способы:
//
//        import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
////Задача 1. Заполнить список названиями планет Молнечной системы в произвольном порядке с повторениями.
////Вывести название каждой планеты и количество повторений в списке.
//public class Task01 {
//
//    public static void main(String[] args) {
//        String[] planets = {"earth", "earth", "mars", "jupiter", "earth",};
////        System.out.println(Arrays.toString(planets));
//
//
//        String[] strings1 = new String[planets.length - 1];
//        var i = 0;
//        int count = 0;
//        System.arraycopy(planets, 0, strings1, 0, i);
//        System.arraycopy(planets, i + 1, strings1, i, strings1.length - i);
//        for (String s : strings1)
//            if (planets[i].equals(s)) {
//                count++;
//                System.out.println(count);
//            }
//
//

//
//        for (var i = 0; i < planets.length - 1; i++) {
//            // Этот код выполняется для каждого элемента
//            int count = 0;
//            var temp = planets[i];
//            if (planets[i + 1] == temp) {
//                count++;
//                System.out.println(count);
//            }
//        }



//        ArrayList<String> planets = new ArrayList();
//        // добавим в список ряд элементов
//        planets.add("Earth");
//        planets.add("Earth");
//        planets.add("Mars");
//        planets.add("Jupiter");
//        planets.add("Earth");
//


//        String[] array = new String[ArrayList.size()];
//        ArrayList.toArray(array);
//        for(int i = 0; i< array.length; i++) {
//            System.out.println(array[i]);
//        }
