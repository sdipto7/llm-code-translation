
import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split("\\s+");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int minVal = Math.min(a, b);
        int difference = Math.max(a, b) - minVal;
        int pairs = difference / 2;
        System.out.println(minVal + " " + pairs);
    }
}

