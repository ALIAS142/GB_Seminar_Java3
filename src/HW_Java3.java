//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее ариф. значение


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_Java3 {

    public static void main(String[] args) {
        List<Integer> Massiv = new ArrayList(Arrays.asList(1, 2, 6, 5, 10, 9, 5, 9, 8, 7));
        System.out.println(Massiv);
        delEven(Massiv);
        System.out.println(FndMin(Massiv));
        System.out.println(FndMax(Massiv));
        System.out.println(Mean(Massiv));

    }


    public static void delEven (List < Integer > ArrayList) {
            for (int i = 0; i < ArrayList.size() - 1; i++) {
                if (ArrayList.get(i) % 2 == 0) {
                    ArrayList.remove(i);
                }
            }
        System.out.println(ArrayList);
        }
    public static Integer FndMax (List < Integer > ArrayList) {
            int max = ArrayList.get(0);
            for (int i = 0; i < ArrayList.size() - 1; i++) {
                if (ArrayList.get(i) > max) {
                    max = ArrayList.get(i);
                }
            }
            return max;
        }
    public static Integer FndMin (List < Integer > ArrayList) {
            int min = ArrayList.get(0);
            for (int i = 0; i < ArrayList.size() - 1; i++) {
                if (ArrayList.get(i) < min) {
                    min = ArrayList.get(i);
                }
            }
            return min;
        }
    public static Double Mean (List < Integer > ArrayList) {
            int sum = 0;
            double average;
            for (int i = 0; i < ArrayList.size() - 1; i++) {
                sum += ArrayList.get(i);
            }
            average = sum / ArrayList.size();
            return average;
        }
    }
