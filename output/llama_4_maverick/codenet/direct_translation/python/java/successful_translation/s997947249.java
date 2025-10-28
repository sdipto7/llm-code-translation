
import java.util.Scanner;
public class s997947249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        if (N % K == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}

