import java.util.Scanner;

public class s031917494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int difference = Math.abs(input - 25);
        String eves = " Eve".repeat(difference);
        String result = "Christmas" + eves;
        System.out.println(result);
    }
}
