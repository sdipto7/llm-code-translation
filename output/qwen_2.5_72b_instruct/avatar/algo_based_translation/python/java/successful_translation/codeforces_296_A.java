
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        List<String> m = new ArrayList<>();
        for (String s : input) {
            m.add(s);
        }
        boolean possible = true;
        HashSet<String> uniqueElements = new HashSet<>(m);
        for (String i : uniqueElements) {
            if (m.stream().filter(i::equals).count() >= n / 2.0 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
        scanner.close();
    }
}

