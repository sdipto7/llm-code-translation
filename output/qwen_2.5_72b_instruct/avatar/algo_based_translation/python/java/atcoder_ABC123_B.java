
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        List<List<Integer>> menu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String m = scanner.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            List<Integer> item = new ArrayList<>();
            item.add(Integer.parseInt(m));
            item.add(e);
            menu.add(item);
        }
        Collections.sort(menu, new Comparator<List<Integer>>() {
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            List<Integer> m = menu.get(i);
            ans += Math.ceil(m.get(0) / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0).get(0));
    }
}

