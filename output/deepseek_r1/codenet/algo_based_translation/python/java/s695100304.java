
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String val : inputValues) {
            numbers.add(Integer.parseInt(val));
        }
        Collections.reverse(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

