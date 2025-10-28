
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = Integer.parseInt(scanner.nextLine());
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
        
        if (z.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
        
        scanner.close();
    }
}

