
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] c = new int[256];
        Set<Character> Sa = new HashSet<>();
        for (char i : S.toCharArray()) {
            c[i]++;
            Sa.add(i);
        }
        if (Sa.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        for (char i : Sa) {
            if (c[i] != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}

