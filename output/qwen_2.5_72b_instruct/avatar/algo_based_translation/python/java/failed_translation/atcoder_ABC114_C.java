
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa("0", N));
    }

    public static int aaa(String n, int N) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        Set<Character> charSet = new HashSet<>();
        for (char c : n.toCharArray()) {
            charSet.add(c);
        }
        int ans = charSet.equals(Set.of('7', '5', '3')) ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i, N);
        }
        return ans;
    }
}

