import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result;
        if (s.contains("A") && s.contains("B")) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
    }
}
