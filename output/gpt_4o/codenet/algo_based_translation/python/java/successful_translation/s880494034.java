
import java.util.Scanner;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        String N = scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] XS = new int[inputArray.length];
        for (int j = 0; j < inputArray.length; j++) {
            XS[j] = Integer.parseInt(inputArray[j]);
        }

        // Initialize minimum sum of squares
        long m = 9999999999L;

        // Iterate over possible values from 1 to 100
        for (int i = 1; i <= 100; i++) {
            long c = 0;
            for (int x : XS) {
                c += (x - i) * (x - i);
            }
            if (m > c) {
                m = c;
            }
        }

        // Output the minimum sum of squares
        System.out.println(m);

        scanner.close();
    }
}

