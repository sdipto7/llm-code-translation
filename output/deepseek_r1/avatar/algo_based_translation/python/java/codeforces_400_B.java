
import java.util.HashSet;
import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        HashSet<Integer> c = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int sPos = s.indexOf('S');
            int gPos = s.indexOf('G');
            c.add(sPos - gPos);
        }

        boolean invalid = false;
        for (int diff : c) {
            if (diff < 0) {
                invalid = true;
                break;
            }
        }

        System.out.println(invalid ? -1 : c.size());
    }
}

