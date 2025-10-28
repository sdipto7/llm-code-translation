
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> grid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            char[] chars = row.toCharArray();
            for (int j = 0; j < m; j++) {
                if (chars[j] == '.') {
                    chars[j] = (i + j) % 2 == 1 ? 'W' : 'B';
                }
            }
            grid.add(new String(chars));
        }

        for (String row : grid) {
            System.out.println(row);
        }
    }
}

