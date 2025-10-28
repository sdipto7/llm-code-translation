
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_519_B {
    public static void main(String[] args) {
        calculateDifferences();
    }

    public static void calculateDifferences() {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        
        int x = 0, y = 0, z = 0;

        String[] aInput = scanner.nextLine().split(" ");
        for (String num : aInput) {
            a.add(Integer.parseInt(num));
        }

        String[] bInput = scanner.nextLine().split(" ");
        for (String num : bInput) {
            b.add(Integer.parseInt(num));
        }

        String[] cInput = scanner.nextLine().split(" ");
        for (String num : cInput) {
            c.add(Integer.parseInt(num));
        }

        for (int i : a) {
            x += i;
        }

        for (int i : b) {
            y += i;
        }

        for (int i : c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));

        scanner.close();
    }
}

