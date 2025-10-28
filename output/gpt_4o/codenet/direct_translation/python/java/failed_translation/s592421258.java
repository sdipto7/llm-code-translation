
import java.util.Scanner;
public class s592421258 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine() + input.nextLine();
        System.out.println(s.contains(input.nextLine()) ? "Yes" : "No");
    }
}

