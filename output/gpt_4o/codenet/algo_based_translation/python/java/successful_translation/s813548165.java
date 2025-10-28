
import java.util.Scanner;

public class s813548165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String[] inputStrings = scanner.nextLine().split(" ");
        String S = inputStrings[0];
        String T = inputStrings[1];

        StringBuilder charLists = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            charLists.append(S.charAt(i));
            charLists.append(T.charAt(i));
        }

        System.out.println(charLists.toString());
        
        scanner.close();
    }
}

