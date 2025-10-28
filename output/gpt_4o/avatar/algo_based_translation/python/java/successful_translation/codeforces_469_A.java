
import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLevel = Integer.parseInt(scanner.nextLine());
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        String[] xInput = scanner.nextLine().split(" ");
        for (String s : xInput) {
            xList.add(Integer.parseInt(s));
        }

        String[] yInput = scanner.nextLine().split(" ");
        for (String s : yInput) {
            yList.add(Integer.parseInt(s));
        }

        xList.remove(0);
        yList.remove(0);

        Set<Integer> xSet = new HashSet<>(xList);
        Set<Integer> ySet = new HashSet<>(yList);

        if (xSet.contains(0)) {
            xSet.remove(0);
        } else if (ySet.contains(0)) {
            ySet.remove(0);
        }

        Set<Integer> zSet = new HashSet<>(xSet);
        zSet.addAll(ySet);

        if (zSet.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }

        scanner.close();
    }
}

