import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Character>> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            List<Character> row = new ArrayList<>();
            for (char ch : s.toCharArray()) {
                row.add(ch);
            }

            for (int j = 0; j < m; j++) {
                if (row.get(j) == '.') {
                    if ((i + j) % 2 == 1) {
                        row.set(j, 'W');
                    } else {
                        row.set(j, 'B');
                    }
                }
            }

            l.add(row);
        }

        for (List<Character> c : l) {
            StringBuilder sb = new StringBuilder();
            for (char ch : c) {
                sb.append(ch);
            }
            System.out.println(sb.toString());
        }

        scanner.close();
    }
}
