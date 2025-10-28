
import java.util.*;

public class s787811177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(new int[]{a, b});
        }
        list.sort((a, b) -> (b[0] + b[1]) - (a[0] + a[1]));
        int taka = 0;
        int aoki = 0;
        for (int i = 0; i < list.size(); i += 2) {
            taka += list.get(i)[0];
        }
        for (int i = 1; i < list.size(); i += 2) {
            aoki += list.get(i)[1];
        }
        System.out.println(taka - aoki);
    }
}

