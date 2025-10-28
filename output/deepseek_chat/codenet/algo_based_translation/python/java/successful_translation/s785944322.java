
import java.util.Scanner;

public class s785944322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int result;
        if (a >= 13) {
            result = b;
        } else if (a >= 6) {
            result = b / 2;
        } else {
            result = 0;
        }
        
        System.out.println(result);
    }
}

