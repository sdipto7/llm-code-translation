
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i : l) {
            if (i % m == 0) {
                l2.add(i / m);
            } else {
                l2.add(i / m + 1);
            }
        }
        int mx = l2.get(0);
        for (int num : l2) {
            if (num > mx) {
                mx = num;
            }
        }
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2.get(i) == mx) {
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}

