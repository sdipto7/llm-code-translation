
import java.util.Scanner;

public class s086522214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String[] T = S.split("/");
        int date = Integer.parseInt(T[1] + T[2]);
        System.out.println(date <= 430 ? "Heisei" : "TBD");
    }
}

