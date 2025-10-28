
import java.util.Scanner;

public class s191853417 {
    public static void main(String[] args) {
        System.out.println(calculateResult());
    }

    public static int calculateResult() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int result = 15 - (a + b + c + d + e);
        return result;
    }
}

