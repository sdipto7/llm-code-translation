
import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int diff = max - min;
        int result = diff / 2;
        System.out.println(min + " " + result);
    }
}

