
import java.util.Scanner;

public class s167793578 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int a = N * (N - 1) / 2;
        int b = M * (M - 1) / 2;
        System.out.println(a + b);
    }
}

