
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        String[] inputs = scanner.nextLine().split(" ");
        for (String input : inputs) {
            list.add(Integer.parseInt(input));
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

