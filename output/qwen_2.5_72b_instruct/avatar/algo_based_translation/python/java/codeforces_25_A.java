
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] input = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String x : input) {
            list.add(Integer.parseInt(x) % 2);
        }
        if (list.stream().mapToInt(Integer::intValue).sum() == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }
}

