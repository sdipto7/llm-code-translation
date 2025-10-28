import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = Integer.parseInt(scanner.nextLine());
        String[] xParts = scanner.nextLine().split(" ");
        String[] yParts = scanner.nextLine().split(" ");
        
        Set<Integer> xSet = new HashSet<>();
        for (int i = 1; i < xParts.length; i++) {
            xSet.add(Integer.parseInt(xParts[i]));
        }
        
        Set<Integer> ySet = new HashSet<>();
        for (int i = 1; i < yParts.length; i++) {
            ySet.add(Integer.parseInt(yParts[i]));
        }
        
        if (xSet.contains(0)) {
            xSet.remove(0);
        } else if (ySet.contains(0)) {
            ySet.remove(0);
        }
        
        Set<Integer> union = new HashSet<>(xSet);
        union.addAll(ySet);
        
        System.out.println(union.size() == maxLevel ? "I become the guy." : "Oh, my keyboard!");
    }
}
