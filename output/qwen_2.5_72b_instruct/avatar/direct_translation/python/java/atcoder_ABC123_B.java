import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        Collections.sort(menu, Comparator.comparingInt(x -> x[1]));
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int[] m = menu.get(i);
            ans += Math.ceil(m[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
