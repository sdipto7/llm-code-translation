
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            int num = Integer.parseInt(part);
            list.add(num % 2);
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        if (sum == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }
}

