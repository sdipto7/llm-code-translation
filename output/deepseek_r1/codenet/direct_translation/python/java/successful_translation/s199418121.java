
import java.util.Scanner;

public class s199418121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1].replace(".", ""));
        System.out.println((long) A * B / 100);
    }
}

