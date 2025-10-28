import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.chars().filter(ch -> ch == '1').count() == 0) {
            System.out.println(0);
        } else {
            String[] parts = a.replaceAll("^0+|0+$", "").split("1");
            long product = 1;
            for (String part : parts) {
                product *= (part.length() + 1);
            }
            System.out.println(product);
        }
    }
}
