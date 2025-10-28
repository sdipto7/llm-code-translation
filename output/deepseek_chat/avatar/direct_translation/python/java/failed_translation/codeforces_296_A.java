



import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        Set<String> uniqueElements = new HashSet<>(Arrays.asList(m));
        for (String element : uniqueElements) {
            int count = 0;
            for (String s : m) {
                if (s.equals(element)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
