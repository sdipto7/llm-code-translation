
import java.util.Scanner;
import java.util.Arrays;

public class s893778513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] l = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        int b = Arrays.stream(l).max().getAsInt();
        int s = Arrays.stream(l).sum();
        if (b < s - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

