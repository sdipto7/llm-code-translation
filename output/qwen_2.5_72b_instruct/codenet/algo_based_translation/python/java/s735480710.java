import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        List<String> a = new ArrayList<>();
        for (String str : inputArray) {
            a.add(str);
        }
        List<String> b = new ArrayList<>();
        List<String> oddIndexedElements = a.subList(1, a.size()).stream().filter((e, i) -> i % 2 == 0).toList();
        Collections.reverse(oddIndexedElements);
        b.addAll(oddIndexedElements);
        b.addAll(a.stream().filter((e, i) -> i % 2 == 0).toList());
        if (a.size() % 2 == 0) {
            System.out.println(String.join(" ", b));
        } else {
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }
    }
}
