
import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxLevel = scanner.nextInt();
        scanner.nextLine();
        
        String[] xInput = scanner.nextLine().split(" ");
        String[] yInput = scanner.nextLine().split(" ");
        
        List<Integer> xList = new ArrayList<>();
        for (int i = 1; i < xInput.length; i++) {
            xList.add(Integer.parseInt(xInput[i]));
        }
        
        List<Integer> yList = new ArrayList<>();
        for (int i = 1; i < yInput.length; i++) {
            yList.add(Integer.parseInt(yInput[i]));
        }
        
        Set<Integer> x = new HashSet<>(xList);
        Set<Integer> y = new HashSet<>(yList);
        
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

