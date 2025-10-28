import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = R(scanner);
        int n = input.get(0);
        int m = input.get(1);
        int s = input.get(2);
        int f = input.get(3);

        int d;
        String c;
        if (s < f) {
            d = 1;
            c = "R";
        } else {
            d = -1;
            c = "L";
        }

        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        input = R(scanner);
        int t = input.get(0);
        int l = input.get(1);
        int r = input.get(2);
        int k = 1;

        while (j != f) {
            if (i > t && k < m) {
                input = R(scanner);
                t = input.get(0);
                l = input.get(1);
                r = input.get(2);
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append("X");
            } else {
                res.append(c);
                j += d;
            }
            i++;
        }
        System.out.println(res.toString());
    }

    public static List<Integer> R(Scanner scanner) {
        List<Integer> result = new ArrayList<>();
        String[] line = scanner.nextLine().split(" ");
        for (String num : line) {
            result.add(Integer.parseInt(num));
        }
        return result;
    }
}
