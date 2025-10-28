
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the rest of the line
        
        String[] input = scanner.nextLine().split(" ");
        List<Integer> x = new ArrayList<>();
        
        for (String s : input) {
            x.add(Integer.parseInt(s));
        }
        
        Collections.reverse(x);
        
        for (int num : x) {
            System.out.print(num + " ");
        }
    }
}

