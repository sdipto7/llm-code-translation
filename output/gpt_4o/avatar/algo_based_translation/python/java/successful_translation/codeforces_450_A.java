
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integers n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Read the list of integers
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        
        // Initialize the list for storing division results
        List<Integer> l2 = new ArrayList<>();
        
        // Process each integer in the list
        for (int i : l) {
            if (i % m == 0) {
                l2.add(i / m);
            } else {
                l2.add(i / m + 1);
            }
        }
        
        // Find the maximum value in l2
        int mx = Integer.MIN_VALUE;
        for (int value : l2) {
            if (value > mx) {
                mx = value;
            }
        }
        
        // Find the index of the last occurrence of mx
        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (l2.get(i) == mx) {
                ind = i;
            }
        }
        
        // Output the result
        System.out.println(ind + 1);
        
        scanner.close();
    }
}

