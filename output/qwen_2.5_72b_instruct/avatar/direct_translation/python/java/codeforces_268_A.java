import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<String>> q = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            List<String> temp = new ArrayList<>();
            for (String s : a) {
                temp.add(s);
            }
            q.add(temp);
        }
        int count = 0;
        for (List<String> j : q) {
            for (List<String> k : q) {
                if (k == j) {
                    continue;
                } else if (j.get(0).equals(k.get(k.size() - 1))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
