
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        
        scanner.nextLine();
        String[] kValues = scanner.nextLine().trim().split("\\s+");
        int r = 1;
        for (String s : kValues) {
            int k = Integer.parseInt(s);
            for (int i = 0; i < k; i++) {
                l.add(r);
            }
            r++;
        }
        
        scanner.nextLine();
        String[] queries = scanner.nextLine().trim().split("\\s+");
        for (String s : queries) {
            int j = Integer.parseInt(s);
            System.out.println(l.get(j - 1));
        }
    }
}

