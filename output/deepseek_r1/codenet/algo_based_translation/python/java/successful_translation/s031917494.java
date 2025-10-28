
import java.util.Scanner;

public class s031917494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine().trim();
        int day = Integer.parseInt(inputStr);
        int diff = day - 25;
        int count = Math.abs(diff);
        StringBuilder evePart = new StringBuilder();
        for (int i = 0; i < count; i++) {
            evePart.append(" Eve");
        }
        System.out.println("Christmas" + evePart.toString());
    }
}

