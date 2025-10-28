
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;

public class codeforces_327_A {
    public static List<Integer> find(String s, char ch) {
        return IntStream.range(0, s.length())
                        .filter(i -> s.charAt(i) == ch)
                        .boxed()
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine().replace("", "");

        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int x0 = indices.get(i);
                        int x1 = indices.get(j);
                        int index1 = indices.indexOf(x0);
                        int index2 = indices.indexOf(x1);
                        int value = 2 + 2 * (Math.abs(index1 - index2) - 1) - (Math.abs(x0 - x1) - 1);
                        maximum = Math.max(maximum, value);
                    }
                }
                System.out.println((int) s.chars().filter(c -> c == '1').count() + maximum);
            }
        }

        scanner.close();
    }
}

