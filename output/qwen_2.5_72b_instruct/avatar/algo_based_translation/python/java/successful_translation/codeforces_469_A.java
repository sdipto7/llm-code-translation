
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_level = scanner.nextInt();
        scanner.nextLine();
        String[] xInput = scanner.nextLine().split(" ");
        String[] yInput = scanner.nextLine().split(" ");
        
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        
        for (int i = 1; i < xInput.length; i++) {
            x.add(Integer.parseInt(xInput[i]));
        }
        
        for (int i = 1; i < yInput.length; i++) {
            y.add(Integer.parseInt(yInput[i]));
        }
        
        if (x.contains(0)) {
            x.remove(0);
        } else if (y.contains(0)) {
            y.remove(0);
        }
        
        Set<Integer> z = new HashSet<>(x);
        z.addAll(y);
        
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
        
        scanner.close();
    }
}

