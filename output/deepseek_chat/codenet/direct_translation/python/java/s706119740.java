import java.util.Arrays;
import java.util.Scanner;

public class s706119740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] candy = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        System.out.println(candy[0] + candy[1] == candy[2] ? "Yes" : "No");
    }
}
