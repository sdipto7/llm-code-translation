import java.util.Scanner;
import java.util.Arrays;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] XS = Arrays.stream(scanner.nextLine().split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        int m = 999999999;
        
        for (int i = 1; i <= 100; i++) {
            int c = 0;
            for (int x : XS) {
                c += (x - i) * (x - i);
            }
            if (m > c) {
                m = c;
            }
        }
        
        System.out.println(m);
    }
}
