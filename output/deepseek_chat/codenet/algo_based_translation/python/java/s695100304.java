
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> x = new ArrayList<>();
        String[] inputArray = scanner.nextLine().split(" ");
        for (String num : inputArray) {
            x.add(Integer.parseInt(num));
        }
        Collections.reverse(x);
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i));
            if (i < x.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

