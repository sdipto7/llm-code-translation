
import java.util.Scanner;

public class atcoder_ABC145_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        
        String result = checkStringHalves(n, s);
        System.out.println(result);
        
        scanner.close();
    }

    public static String checkStringHalves(int n, String s) {
        if (n % 2 != 0) {
            return "No";
        } else {
            int halfLength = n / 2;
            if (s.substring(0, halfLength).equals(s.substring(halfLength))) {
                return "Yes";
            } else {
                return "No";
            }
        }
    }
}

