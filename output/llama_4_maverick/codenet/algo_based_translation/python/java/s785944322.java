
import java.util.Scanner;

public class s785944322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a >= 13) {
            System.out.println(b);
        } else if (a >= 6) {
            System.out.println(b / 2);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}

