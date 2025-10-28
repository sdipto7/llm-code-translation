
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s759499751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String input = scanner.next();
        List<Character> a = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            a.add(ch);
        }
        int[] c = new int[n];
        for (int i = 1; i < n; i++) {
            if (a.get(i) == 'C' && a.get(i - 1) == 'A') {
                c[i] = c[i - 1] + 1;
            } else {
                c[i] = c[i - 1];
            }
        }
        for (int w = 0; w < k; w++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(c[r - 1] - c[l - 1]);
        }
        scanner.close();
    }
}

