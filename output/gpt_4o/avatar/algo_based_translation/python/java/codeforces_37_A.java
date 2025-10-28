
import java.util.*;

public class codeforces_37_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> l = new ArrayList<>();
        String[] inputNumbers = scanner.nextLine().split(" ");
        for (String num : inputNumbers) {
            l.add(Integer.parseInt(num));
        }
        scanner.close();

        int[] result = calculateTowerAndMaximumHeight(n, l);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] calculateTowerAndMaximumHeight(int n, List<Integer> l) {
        int high = 1;
        int tower = n;
        int maximum = 1;

        Collections.sort(l);

        for (int i = 1; i < n; i++) {
            if (l.get(i).equals(l.get(i - 1))) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }

        if (high > maximum) {
            maximum = high;
        }

        return new int[]{maximum, tower};
    }
}

