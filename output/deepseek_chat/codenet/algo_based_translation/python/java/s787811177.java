
import java.util.*;

public class s787811177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ls.add(new int[]{a, b});
        }
        ls.sort((x, y) -> Integer.compare(y[0] + y[1], x[0] + x[1]));
        int taka = 0;
        for (int i = 0; i < ls.size(); i += 2) {
            taka += ls.get(i)[0];
        }
        int aoki = 0;
        for (int i = 1; i < ls.size(); i += 2) {
            aoki += ls.get(i)[1];
        }
        System.out.println(taka - aoki);
    }
}

