
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String n;
        List<String> a = Arrays.asList("10", "100", "1000", "10000", "100000");
        
        // Step 1: Read input from the user and assign it to variable n.
        n = scanner.nextLine();
        
        // Step 2 & 3: Convert each character of the string n to an integer and calculate the sum.
        int newSum = 0;
        for (char c : n.toCharArray()) {
            newSum += Character.getNumericValue(c);
        }
        
        // Step 4: Check if n is present in the list a.
        // Step 5 & 6: Print the integer 10 if present, otherwise print the value of newSum.
        if (a.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(newSum);
        }
        
        scanner.close();
    }
}

