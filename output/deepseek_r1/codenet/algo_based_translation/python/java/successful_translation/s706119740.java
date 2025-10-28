
import java.util.Arrays;
import java.util.Scanner;

public class s706119740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] candy = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            candy[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(candy);
        if (candy[0] + candy[1] == candy[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

