import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Code5358_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Character> map = new HashMap<>();

        map.put('i', 'e');
        map.put('e', 'i');
        map.put('I', 'E');
        map.put('E', 'I');

        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {
            String line = sc.nextLine();

            for (char c : line.toCharArray()) {
                if (map.containsKey(c)) {
                    sb.append(map.get(c));
                } else {
                    sb.append(c);
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}