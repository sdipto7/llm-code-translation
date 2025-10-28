
import java.util.*;

public class codeforces_653_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer input
        int n = Integer.parseInt(scanner.nextLine());

        // Read list of integers
        List<Integer> l = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            l.add(Integer.parseInt(s));
        }

        // Sort the list
        Collections.sort(l);

        // Check for consecutive triplets
        boolean found = false;
        for (int i = 0; i < l.size(); i++) {
            if (l.contains(l.get(i) + 1) && l.contains(l.get(i) + 2)) {
                System.out.println("YES");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NO");
        }

        scanner.close();
    }
}

