
import java.util.Scanner;

public class s086522214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] T = S.split("/");
        String D = T[1] + T[2];
        int date = Integer.parseInt(D);
        System.out.println(date <= 430 ? "Heisei" : "TBD");
    }
}

