import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> x = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).toList();
        Collections.reverse(x);
        for (int num : x) {
            System.out.print(num + " ");
        }
    }
}
