
import java.util.Scanner;

public class s592421258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String searchStr = scanner.nextLine();
        String doubledS = s + s;
        if (doubledS.contains(searchStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

