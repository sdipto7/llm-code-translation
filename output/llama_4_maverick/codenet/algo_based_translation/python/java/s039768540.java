
import java.util.Scanner;

public class s039768540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        int temp = x / 100;
        StringBuilder repeatedString = new StringBuilder();
        for (int i = 0; i < temp; i++) {
            repeatedString.append("3");
        }
        String outputString = "ai1333" + repeatedString.toString();
        System.out.println(outputString);
    }
}

