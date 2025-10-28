
import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        scanner.nextLine();
        
        Set<Integer> x = new HashSet<>();
        String[] xInput = scanner.nextLine().split(" ");
        for (int i = 1; i < xInput.length; i++) {
            x.add(Integer.parseInt(xInput[i]));
        }
        
        Set<Integer> y = new HashSet<>();
        String[] yInput = scanner.nextLine().split(" ");
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
        
        if (z.size() == maxLevel) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}

