
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] inputValues = scanner.nextLine().split(" ");
        List<Integer> w = new ArrayList<>();
        for (String val : inputValues) {
            w.add(Integer.parseInt(val));
        }
        int c = 2;
        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}

