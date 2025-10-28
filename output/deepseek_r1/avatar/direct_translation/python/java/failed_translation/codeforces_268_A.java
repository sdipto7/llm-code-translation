
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            list.add(parts);
        }
        int count = 0;
        for (String[] j : list) {
            for (String[] k : list) {
                if (j == k) {
                    continue;
                }
                if (j[0].length() > 0 && k[k.length - 1].length() > 0) {
                    if (j[0].charAt(0) == k[k.length - 1].charAt(0)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

