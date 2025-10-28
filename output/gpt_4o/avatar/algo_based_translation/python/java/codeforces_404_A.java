
import java.util.*;

public class codeforces_404_A {

    public static String checkPattern(int n, List<String> s) {
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char currentChar = s.get(i).charAt(j);
                if (i == j) {
                    d1.add(currentChar);
                }
                if (i == n - j - 1) {
                    d2.add(currentChar);
                }
                if (i != j && i != n - j - 1) {
                    rem.add(currentChar);
                }
            }
        }

        if (rem.size() != 1) {
            return "NO";
        }
        if (!d1.equals(d2)) {
            return "NO";
        }
        if (new HashSet<>(d1).size() != 1) {
            return "NO";
        }
        if (new HashSet<>(d1).equals(rem)) {
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(scanner.nextLine());
        }

        String result = checkPattern(n, s);
        System.out.println(result);
    }
}

