import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {

        List array = new ArrayList<>(Arrays.asList("Earth", "Mars", 3, "Jupiter", 1, 2, "Saturn", 7, "Earth", 3, 4, "Mars"));
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) instanceof Integer){
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);
        }
    }