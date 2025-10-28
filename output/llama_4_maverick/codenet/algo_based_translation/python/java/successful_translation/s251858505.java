import java.util.Scanner;

public class s251858505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        scanner.close();

        int sumResult = 0;
        int length = Math.min(input1.length(), input2.length());
        for (int i = 0; i < length; i++) {
            char x = input1.charAt(i);
            char y = input2.charAt(i);
            sumResult += (x == y) ? 1 : 0;
        }

        System.out.println(sumResult);
    }
}
