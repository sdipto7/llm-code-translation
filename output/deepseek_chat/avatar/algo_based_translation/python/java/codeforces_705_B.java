
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Integer> w = new ArrayList<>();
        String[] parts = scanner.nextLine().split(" ");
        for (String part : parts) {
            w.add(Integer.parseInt(part));
        }
        
        int c = 2;
        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}

