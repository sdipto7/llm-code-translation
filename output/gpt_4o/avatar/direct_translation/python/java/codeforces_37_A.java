
import java.util.*;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int high = 1;
        int tower = n;
        int maximum = 1;
        Arrays.sort(l);
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower -= 1;
                high += 1;
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
        System.out.println(maximum + " " + tower);
    }
}

