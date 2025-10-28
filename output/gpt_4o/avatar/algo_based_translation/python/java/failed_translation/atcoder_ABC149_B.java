
import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a line of input from the user
        String[] input = scanner.nextLine().split(" ");
        
        // Convert each component to an integer and store them in a list called `cookies`
        int[] cookies = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            cookies[i] = Integer.parseInt(input[i]);
        }
        
        // Calculate `leftOver` as the difference between the first and third elements of `cookies`
        int leftOver = cookies[0] - cookies[2];
        
        // Calculate `takahashi` as the maximum between 0 and `leftOver`
        int takahashi = Math.max(0, leftOver);
        
        // Initialize result string
        String result;
        
        // Conditional logic to determine the output string
        if (takahashi > 0) {
            result = takahashi + " " + cookies[1];
        } else {
            result = takahashi + " " + Math.max(0, cookies[1] - Math.abs(leftOver));
        }
        
        // Print the resulting string
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }
}

