import java.util.*;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        menu.sort((a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        for (int[] m : menu.subList(1, menu.size())) {
            ans += Math.ceil((double) m[0] / 10) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
