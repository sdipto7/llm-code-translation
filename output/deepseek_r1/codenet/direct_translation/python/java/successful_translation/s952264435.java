
import java.util.Scanner;

public class s952264435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] aStr = sc.nextLine().split(" ");
        int sum = 0;
        for (String s : aStr) {
            sum += Integer.parseInt(s);
        }
        int res = N - sum;
        System.out.println(res >= 0 ? res : -1);
    }
}

