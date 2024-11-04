import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("banana", 4);
        map.remove("orange");

        System.out.println(map);

        String key = "orange";

        if(map.containsKey(key)) {
            int value = map.get(key);
            System.out.println(key + ": " + value);
        } else {
            System.out.println(key + "는 해쉬맵에 없습니다.");
        }
    }
}