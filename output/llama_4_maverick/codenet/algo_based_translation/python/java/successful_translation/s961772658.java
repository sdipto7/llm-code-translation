
import java.util.Scanner;

public class s961772658 {
    public static void get_next_alphabet() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i].equals(s)) {
                if(i < alphabets.length - 1)
                    System.out.println(alphabets[i + 1]);
                else 
                    ; // or handle the case when input is 'z'
            }
        }
    }

    public static void main(String[] args) {
        get_next_alphabet();
    }
}

