import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
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
