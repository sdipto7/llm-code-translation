
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] a = new int[input.length];
        
        for (int j = 0; j < input.length; j++) {
            a[j] = Integer.parseInt(input[j]);
        }
        
        for (int e = 0; e < a.length; e++) {
            if (a[e] == 0) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}

