
import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int vamshi = Integer.parseInt(parts[0]);
        int z = Integer.parseInt(parts[1]);
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
        scanner.close();
    }
}

