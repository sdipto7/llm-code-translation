
import java.util.Scanner;
import java.util.Iterator;

public class atcoder_ABC154_A {

    public static void solve(String S, String T, int A, int B, String U) {
        if (S.equals(U)) {
            A = A - 1;
        }
        if (T.equals(U)) {
            B = B - 1;
        }
        System.out.println(A + " " + B);
    }

    public static Iterator<String> iterateTokens(Scanner scanner) {
        return new Iterator<String>() {
            String[] words = new String[0];
            int index = 0;

            @Override
            public boolean hasNext() {
                while (index >= words.length && scanner.hasNextLine()) {
                    words = scanner.nextLine().split(" ");
                    index = 0;
                }
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iterator<String> tokens = iterateTokens(scanner);
        
        String S = tokens.next();
        String T = tokens.next();
        int A = Integer.parseInt(tokens.next());
        int B = Integer.parseInt(tokens.next());
        String U = tokens.next();

        solve(S, T, A, B, U);
    }
}

