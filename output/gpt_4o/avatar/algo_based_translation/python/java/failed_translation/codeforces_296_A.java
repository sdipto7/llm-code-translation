
import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        String[] m = scanner.nextLine().split(" ");
        
        System.out.println(isPossible(n, m));
    }

    public static String isPossible(int n, List<String> m) {
        boolean possible = true;
        
        Set<String> uniqueElements = new HashSet<>(m);
        
        for (String i : uniqueElements) {
            long count = m.stream().filter(x -> x.equals(i)).count();
            if (count >= (n / 2.0 + 1)) {
                possible = false;
                break;
            }
        }
        
        return possible ? "YES" : "NO";
    }
}

