
import java.util.ArrayList;
import java.util.Scanner;

public class s813548165 {
    public static void main(String[] args) {
        System.out.println(interleaveStrings());
    }

    public static String interleaveStrings() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String[] inputs = scanner.nextLine().split(" ");
        String S = inputs[0];
        String T = inputs[1];
        ArrayList<String> charLists = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            charLists.add(String.valueOf(S.charAt(i)));
            charLists.add(String.valueOf(T.charAt(i)));
        }
        StringBuilder result = new StringBuilder();
        for (String str : charLists) {
            result.append(str);
        }
        System.out.println(result.toString());
        return result.toString();
    }
}

