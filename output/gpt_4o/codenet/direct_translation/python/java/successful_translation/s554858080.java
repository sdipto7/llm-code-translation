
import java.util.Scanner;

public class s554858080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        StringBuilder num = new StringBuilder();

        for (String str : input) {
            num.append(str);
        }

        if (Integer.parseInt(num.toString()) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

