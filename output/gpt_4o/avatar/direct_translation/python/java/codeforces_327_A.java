
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_327_A {
    public static List<Integer> find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices;
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
                        maximum = Math.max(maximum, 2 + 2 * (Math.abs(i - j) - 1) - (Math.abs(x0 - x1) - 1));
                    }
                }
                System.out.println(countOnes(s) + maximum);
            }
        }
    }

    public static int countOnes(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}

