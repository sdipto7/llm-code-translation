
import java.util.Scanner;

public class s199418121 {
    public static void main(String[] args) {
        calculateProduct();
    }

    public static void calculateProduct() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String A = input[0];
        String B = input[1];
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B.replace(".", ""));
        int result = (a * b) / 100;
        System.out.println(result);
        scanner.close();
    }
}

