
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        String result = user_input.replace(",", " ");
        System.out.println(result);
        scanner.close();
    }
}

