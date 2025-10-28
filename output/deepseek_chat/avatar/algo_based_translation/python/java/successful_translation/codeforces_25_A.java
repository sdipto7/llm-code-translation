
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputTokens = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String token : inputTokens) {
            int num = Integer.parseInt(token);
            list.add(num % 2);
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        if (sum == 1) {
            int index = list.indexOf(1);
            System.out.println(index + 1);
        } else {
            int index = list.indexOf(0);
            System.out.println(index + 1);
        }
    }
}

