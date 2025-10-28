
import java.util.Scanner;

public class s185068963 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        System.out.println(checkSum(a, b, c));
    }

    public static String checkSum(int a, int b, int c) {
        return (a + b >= c) ? "Yes" : "No";
    }
}

