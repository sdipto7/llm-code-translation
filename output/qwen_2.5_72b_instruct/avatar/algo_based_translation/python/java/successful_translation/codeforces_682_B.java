
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_682_B {
    private static List<Integer> I(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    private static String IS(Scanner scanner) {
        return scanner.nextLine();
    }

    private static int IN(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static float IF(Scanner scanner) {
        return Float.parseFloat(scanner.nextLine());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = IN(scanner);
        List<Integer> l = I(scanner);
        int f = 1;
        Collections.sort(l);
        int c = 0;
        for (int i : l) {
            if (i > c) {
                c += 1;
            }
        }
        System.out.println(c + 1);
        scanner.close();
    }
}

