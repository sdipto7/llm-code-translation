
import java.util.*;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(l);
        int high = 1, tower = n, maximum = 1;
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) maximum = high;
                high = 1;
            }
        }
        if (high > maximum) maximum = high;
        System.out.println(maximum + " " + tower);
    }
}

