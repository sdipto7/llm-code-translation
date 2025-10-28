
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");
        int[] a = new int[numberStrings.length];
        
        for (int j = 0; j < numberStrings.length; j++) {
            a[j] = Integer.parseInt(numberStrings[j]);
        }

        for (int e = 0; e < a.length; e++) {
            int i = a[e];
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
        }

        scanner.close();
    }
}

