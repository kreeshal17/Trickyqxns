import java.util.*;

public class RansomeNote {

    public static void main(String[] args) {

        System.out.println(solutiBoolean("krish", "krishal"));
        System.out.println(solutiBoolean("rajesh", "raj"));
    }

    public static Boolean solutiBoolean(String magazine, String ransome) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransome.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
