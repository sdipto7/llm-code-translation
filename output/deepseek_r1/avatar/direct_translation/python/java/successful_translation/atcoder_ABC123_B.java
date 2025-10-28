
import java.util.*;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.nextLine();
            int num = Integer.parseInt(m);
            char lastChar = m.charAt(m.length() - 1);
            int e = Character.getNumericValue(lastChar);
            if (e == 0) e = 10;
            menu.add(new int[]{num, e});
        }
        menu.sort(Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int[] item = menu.get(i);
            ans += Math.ceil(item[0] / 10.0) * 10;
        }
        ans += menu.get(0)[0];
        System.out.println(ans);
    }
}

