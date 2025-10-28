import java.util.Scanner;
import java.util.Arrays;

public class s961772658 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i].equals(s)) {
                if (i + 1 < alphabets.length) {
                    System.out.println(alphabets[i + 1]);
                }
                break;
            }
        }
    }
}
