import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Acer on 11.10.2016.
 */
public class task2057 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == 1) {
                int k = scanner.nextInt();
                if (map.get(k) == null) map.put(k, 1);
                else map.put(k, map.get(k) + 1);
            } else {
                Integer firstKey = map.firstKey();
                Integer count = map.get(firstKey);
                System.out.println(firstKey);
                if (count == 1) map.remove(firstKey);
                else map.put(firstKey, count - 1);
            }
        }
    }
}
