
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_11_A {

    public static int calculateMinMoves(int n, int d, List<Integer> x) {
        int m = 0;
        
        for (int a = 0; a < n - 1; a++) {
            if (x.get(a) >= x.get(a + 1)) {
                int q = ((x.get(a) - x.get(a + 1)) / d) + 1;
                m += q;
                x.set(a + 1, x.get(a + 1) + q * d);
            }
        }
        
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int d = Integer.parseInt(firstLine[1]);

        List<Integer> x = new ArrayList<>();
        String[] elements = scanner.nextLine().split(" ");
        
        for (String element : elements) {
            x.add(Integer.parseInt(element));
        }

        int result = calculateMinMoves(n, d, x);
        System.out.println(result);
        
        scanner.close();
    }
}

