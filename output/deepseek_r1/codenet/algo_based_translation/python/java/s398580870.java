
import java.util.Scanner;

public class s398580870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k % 2 == 1) {
            int cube = (n / k) * (n / k) * (n / k);
            System.out.println(cube);
        } else {
            int cube1 = (n / k) * (n / k) * (n / k);
            int cube2 = ((n + (k / 2)) / k) * ((n + (k / 2)) / k) * ((n + (k / 2)) / k);
            System.out.println(cube1 + cube2);
        }
    }
}

