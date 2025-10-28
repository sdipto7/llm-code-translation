
import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min + " " + (max - min) / 2);
    }
}

