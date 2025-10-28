
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class codeforces_583_B {
    public static void main(String[] args) {
        main_function();
    }

    public static void main_function() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int current_level = 0;
        int counter = 0;
        int counter_turns = -1;
        while (counter < a.size()) {
            counter_turns++;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != -1 && a.get(i) <= counter) {
                    counter++;
                    a.set(i, -1);
                }
            }
            Collections.reverse(a);
        }
        System.out.println(counter_turns);
        scanner.close();
    }
}

