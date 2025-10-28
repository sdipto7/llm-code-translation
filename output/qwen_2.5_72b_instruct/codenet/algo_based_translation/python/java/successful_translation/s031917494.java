import java.util.Scanner;

public class s031917494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_value = Integer.parseInt(scanner.nextLine());
        int repeatCount = Math.abs(input_value - 25);
        String eveRepeated = "Eve".repeat(repeatCount);
        String result = "Christmas" + eveRepeated;
        System.out.println(result);
        scanner.close();
    }
}
