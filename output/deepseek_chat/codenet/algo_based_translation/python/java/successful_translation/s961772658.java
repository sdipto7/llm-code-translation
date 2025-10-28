
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class s961772658 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> alphabets = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        for (int i = 0; i < alphabets.size(); i++) {
            if (alphabets.get(i).equals(s)) {
                System.out.println(alphabets.get(i + 1));
                break;
            }
        }
        scanner.close();
    }
}

