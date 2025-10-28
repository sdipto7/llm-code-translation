
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
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine().replaceAll(" ", "");
        List<Integer> indices = find(s, '0');

        if (indices.isEmpty()) {
            System.out.println(n - 1);
        } else if (indices.size() == 1) {
            System.out.println(n);
        } else {
            int maximum = 0;
            for (int i = 0; i < indices.size(); i++) {
                for (int j = i + 1; j < indices.size(); j++) {
                    int a = indices.get(i);
                    int b = indices.get(j);
                    int diffIndices = j - i - 1;
                    int term = 2 + 2 * diffIndices;
                    int distanceActual = Math.abs(a - b) - 1;
                    int currentValue = term - distanceActual;
                    maximum = Math.max(maximum, currentValue);
                }
            }
            int countOnes = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    countOnes++;
                }
            }
            System.out.println(countOnes + maximum);
        }
    }
}

