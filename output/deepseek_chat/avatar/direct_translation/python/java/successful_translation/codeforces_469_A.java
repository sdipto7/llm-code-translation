
import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLevel = sc.nextInt();
        sc.nextLine();
        String[] xInput = sc.nextLine().split(" ");
        String[] yInput = sc.nextLine().split(" ");
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 1; i < xInput.length; i++) {
            x.add(Integer.parseInt(xInput[i]));
        }
        for (int i = 1; i < yInput.length; i++) {
            y.add(Integer.parseInt(yInput[i]));
        }
        x.remove(0);
        y.remove(0);
        Set<Integer> z = new HashSet<>(x);
        z.addAll(y);
        if (z.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}

