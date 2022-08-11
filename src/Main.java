import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 1);
                continue;
            }
            map.put(c, map.get(c) + 1);
        }

        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int key : map.values()) {
            if (key > max) {
                max = key;
                continue;
            }
            min = key;
        }

        System.out.println(max);
        System.out.println(min);
    }
}
