
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] a = scanner.nextLine().split(" ");
        List<String> b = new ArrayList<>();

        List<String> temp = new ArrayList<>();
        for (int i = 1; i < a.length; i += 2) {
            temp.add(a[i]);
        }
        Collections.reverse(temp);
        for (String s : temp) {
            b.add(s);
        }
        for (int i = 0; i < a.length; i += 2) {
            b.add(a[i]);
        }

        if (a.length % 2 == 0) {
            System.out.println(String.join(" ", b));
        } else {
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }
    }
}

