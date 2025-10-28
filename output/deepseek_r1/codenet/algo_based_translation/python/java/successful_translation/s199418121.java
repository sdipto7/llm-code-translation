
import java.util.Scanner;

public class s199418121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int A = Integer.parseInt(parts[0]);
        long B = Long.parseLong(parts[1].replace(".", ""));
        System.out.println(A * B / 100);
    }
}

