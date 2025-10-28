
import java.util.Scanner;

public class s702834515 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long r = 0;
        for (int ii = 0; ii < n; ii++) {
            int current = ii + 1;
            if (current % 3 != 0 && current % 5 != 0) {
                r += current;
            }
        }
        System.out.println(r);
    }
}

