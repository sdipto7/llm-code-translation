
import java.util.Scanner;

public class s147181072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.toUpperCase().replaceAll("[A-Z]", "[a-z]") + input.toLowerCase().replaceAll("[a-z]", "[A-Z]"));
    }
}

