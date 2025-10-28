
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> L = new ArrayList<>();
        
        scanner.nextLine();
        int r = 1;
        String[] firstTokens = scanner.nextLine().split(" ");
        for (String k : firstTokens) {
            int count = Integer.parseInt(k);
            for (int i = 0; i < count; i++) {
                L.add(r);
            }
            r++;
        }
        
        scanner.nextLine();
        String[] secondTokens = scanner.nextLine().split(" ");
        for (String j : secondTokens) {
            int index = Integer.parseInt(j) - 1;
            System.out.println(L.get(index));
        }
    }
}

