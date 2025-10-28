
import java.util.Scanner;

public class s592421258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String s = input1 + input1;
        String input2 = scanner.nextLine();
        System.out.println(s.contains(input2) ? "Yes" : "No");
    }
}

