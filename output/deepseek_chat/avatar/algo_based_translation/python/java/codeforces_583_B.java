import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String num : inputArray) {
            a.add(Integer.parseInt(num));
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        
        while (counter < a.size()) {
            counterTurns++;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != -1 && a.get(i) <= counter) {
                    counter++;
                    a.set(i, -1);
                }
            }
            Collections.reverse(a);
        }
        
        System.out.println(counterTurns);
    }
}
