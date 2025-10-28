
import java.util.*;

public class codeforces_108_B {
    static String s() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> a = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String str : input) {
            a.add(Integer.parseInt(str));
        }
        Collections.sort(a);
        for (int i = 1; i < a.size(); i++) {
            if (!a.get(i).equals(a.get(i - 1)) && a.get(i) < a.get(i - 1) * 2) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(s());
    }
}

