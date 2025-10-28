
import java.util.List;

public class codeforces_342_B {
    
    public static String navigatePath(int n, int m, int s, int f, List<int[]> events) {
        int d;
        String c;
        if (s < f) {
            d = 1;
            c = "R";
        } else {
            d = -1;
            c = "L";
        }

        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        int[] firstEvent = events.get(0);
        int t = firstEvent[0];
        int l = firstEvent[1];
        int r = firstEvent[2];
        int k = 1;

        while (j != f) {
            if (i > t && k < m) {
                int[] nextEvent = events.get(k);
                t = nextEvent[0];
                l = nextEvent[1];
                r = nextEvent[2];
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append("X");
            } else {
                res.append(c);
                j += d;
            }
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // Example usage
        // Initialize the list of events (Example: List.of(new int[]{t1, l1, r1}, new int[]{t2, l2, r2}, ...))
        // Call navigatePath with appropriate parameters
        // Print the result
    }
}

