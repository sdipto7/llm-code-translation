import java.util.Scanner;

public class s199418121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");
        String A_str = parts[0];
        String B_str = parts[1];
        int A = Integer.parseInt(A_str);
        String B_cleaned = B_str.replace(".", "");
        int B = Integer.parseInt(B_cleaned);
        int product = A * B;
        int result = product / 100;
        System.out.println(result);
    }
}
