
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        List<List<String>> q = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            List<String> list = new ArrayList<>();
            for (String s : a) {
                list.add(s);
            }
            q.add(list);
        }

        for (List<String> j : q) {
            for (List<String> k : q) {
                if (k.equals(j)) {
                    continue;
                } else if (j.get(0).equals(k.get(k.size() - 1))) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

