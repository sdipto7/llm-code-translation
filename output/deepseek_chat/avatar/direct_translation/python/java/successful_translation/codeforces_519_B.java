import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> a = new ArrayList<>();
        for (String num : scanner.nextLine().split(" ")) {
            a.add(Integer.parseInt(num));
        }
        List<Integer> b = new ArrayList<>();
        for (String num : scanner.nextLine().split(" ")) {
            b.add(Integer.parseInt(num));
        }
        List<Integer> c = new ArrayList<>();
        for (String num : scanner.nextLine().split(" ")) {
            c.add(Integer.parseInt(num));
        }
        int x = 0, y = 0, z = 0;
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
    }
}
