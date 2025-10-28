
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        Set<String> uniqueElements = new HashSet<>();
        for (String element : m) {
            uniqueElements.add(element);
        }
        for (String i : uniqueElements) {
            int count = 0;
            for (String element : m) {
                if (element.equals(i)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}

