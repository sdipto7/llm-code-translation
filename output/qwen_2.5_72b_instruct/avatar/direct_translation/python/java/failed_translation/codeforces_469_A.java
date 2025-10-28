import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        scanner.nextInt();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num != 0) {
                x.add(num);
            } else {
                break;
            }
        }
        scanner.nextInt();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num != 0) {
                y.add(num);
            } else {
                break;
            }
        }
        x.addAll(y);
        if (x.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
