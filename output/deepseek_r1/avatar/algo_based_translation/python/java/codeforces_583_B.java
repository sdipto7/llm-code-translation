
import java.util.*;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] inputValues = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String val : inputValues) {
            a.add(Integer.parseInt(val));
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;

        while (counter < a.size()) {
            counterTurns++;
            for (int i = 0; i < a.size(); i++) {
                int current = a.get(i);
                if (current != -1 && current <= counter) {
                    counter++;
                    a.set(i, -1);
                }
            }
            Collections.reverse(a);
        }

        System.out.println(counterTurns);
    }
}

