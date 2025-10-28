
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> L = new ArrayList<>();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int r = 1;
        for (String part : parts) {
            int num = Integer.parseInt(part);
            for (int i = 0; i < num; i++) {
                L.add(r);
            }
            r++;
        }
        scanner.nextLine();
        String[] queries = scanner.nextLine().split(" ");
        for (String query : queries) {
            int index = Integer.parseInt(query) - 1;
            System.out.println(L.get(index));
        }
    }
}

