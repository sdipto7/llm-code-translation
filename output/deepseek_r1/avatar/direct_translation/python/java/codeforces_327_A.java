
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_327_A {
    public static ArrayList<Integer> find(String s, char ch) {
        ArrayList<Integer> indices = new ArrayList<>();
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
        String s = scanner.nextLine().replaceAll(" ", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            ArrayList<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int max = 0;
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int a = indices.get(i);
                        int b = indices.get(j);
                        int temp = 2 + 2 * (Math.abs(i - j) - 1) - (Math.abs(a - b) - 1);
                        if (temp > max) {
                            max = temp;
                        }
                    }
                }
                int countOnes = 0;
                for (char c : s.toCharArray()) {
                    if (c == '1') {
                        countOnes++;
                    }
                }
                System.out.println(countOnes + max);
            }
        }
    }
}

