
import java.util.Scanner;

public class s185068963 {

    public static String checkSum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        if (a + b >= c) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkSum());
    }
}

