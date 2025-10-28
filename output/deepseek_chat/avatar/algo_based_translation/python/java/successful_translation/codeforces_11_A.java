
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> x = new ArrayList<>();
        int m = 0;
        int q = 0;
        String[] inputArray = scanner.nextLine().split(" ");
        for (String num : inputArray) {
            x.add(Integer.parseInt(num));
        }
        for (int a = 0; a < x.size() - 1; a++) {
            if (x.get(a) >= x.get(a + 1)) {
                q = (x.get(a) - x.get(a + 1)) / d + 1;
                m += q;
                x.set(a + 1, x.get(a + 1) + q * d);
            }
        }
        System.out.println(m);
        scanner.close();
    }
}

