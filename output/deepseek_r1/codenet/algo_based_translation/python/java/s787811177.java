
import java.util.*;

public class s787811177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            list.add(new int[]{a, b});
        }
        Collections.sort(list, (a, b) -> (b[0] + b[1]) - (a[0] + a[1]));
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

