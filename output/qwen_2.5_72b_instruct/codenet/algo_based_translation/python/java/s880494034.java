
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        List<Integer> XS = new ArrayList<>();
        for (String s : input) {
            XS.add(Integer.parseInt(s));
        }
        int m = 999999999;
        for (int i = 1; i <= 100; i++) {
            int c = 0;
            for (int x : XS) {
                c += Math.pow(x - i, 2);
            }
            if (m > c) {
                m = c;
            }
        }
        System.out.println(m);
    }
}

