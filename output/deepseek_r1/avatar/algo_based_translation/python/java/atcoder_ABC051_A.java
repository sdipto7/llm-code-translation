
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String processedStr = inputStr.replace(',', ' ');
        System.out.println(processedStr);
    }
}

