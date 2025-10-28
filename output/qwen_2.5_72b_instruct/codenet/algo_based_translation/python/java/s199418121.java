
import java.util.Scanner;

public class s199418121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] parts = inputString.split(" ");
        int A = Integer.parseInt(parts[0]);
        String B = parts[1];
        String B_processed = B.replace(".", "");
        int B_processed_int = Integer.parseInt(B_processed);
        int result = (A * B_processed_int) / 100;
        System.out.println(result);
        scanner.close();
    }
}

