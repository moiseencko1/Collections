import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Acer on 11.10.2016.
 */
public class task2056 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        StringBuffer str = new StringBuffer(scanner.next().toLowerCase());

        while (scanner.hasNext()) {
            str.append(" " + scanner.next().toLowerCase());
        }

        String s[] = str.toString().split(" ");
        for (int i = 0; i < s.length; i++)
            if (map.get(s[i]) != null) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], 1);
            }

        int max = 0;
        for (int i : map.values())
            max = i > max ? i : max;

        for (String s1 : map.keySet())
            if (map.get(s1) == max) System.out.println(s1);
    }
}
