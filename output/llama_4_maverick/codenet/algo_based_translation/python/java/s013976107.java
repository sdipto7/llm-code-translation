
import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        validateString();
    }

    public static void validateString() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        String S = scanner.nextLine();
        char[] charArray = S.toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (c == '-') {
                count++;
            }
        }
        if (charArray[A] == '-' && count == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}

