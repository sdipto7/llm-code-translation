
import java.util.Scanner;

public class s451465602 {
    public static void time_conversion() {
        int n, h, m, s;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        h = n / 3600;
        n %= 3600;
        m = n / 60;
        n %= 60;
        s = n;
        System.out.println(String.format("%d:%d:%d", h, m, s));
    }

    public static void main(String[] args) {
        time_conversion();
    }
}

