
import java.util.Scanner;

public class s199418121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1].replace(".", ""));
        System.out.println(A * B / 100);
    }
}

