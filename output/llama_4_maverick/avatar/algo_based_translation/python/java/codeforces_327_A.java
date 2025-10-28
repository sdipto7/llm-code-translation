
import java.util.*;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next().replaceAll("", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    indices.add(i);
                }
            }
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int index_x0 = i;
                        int index_x1 = j;
                        int diff_indices = Math.abs(index_x0 - index_x1);
                        int diff_x = Math.abs(indices.get(i) - indices.get(j));
                        maximum = Math.max(maximum, 2 + 2 * (diff_indices - 1) - (diff_x - 1));
                    }
                }
                int count = 0;
                for (char c : s.toCharArray()) {
                    if (c == '1') {
                        count++;
                    }
                }
                System.out.println(count + maximum);
            }
        }
    }
}

