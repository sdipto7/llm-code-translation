import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine();
        int count = 0;
        for (char c : a.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            String[] parts = a.strip().split("1");
            int product = 1;
            for (String part : parts) {
                product *= part.length() + 1;
            }
            System.out.println(product);
        }
    }
}
