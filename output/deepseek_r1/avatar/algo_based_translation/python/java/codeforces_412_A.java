
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String v = scanner.nextLine();
        ArrayList<String> commands = new ArrayList<>();
        boolean isLeftCloser = (k - 1) < (n - k);
        int minSteps = Math.min(k - 1, n - k);
        String[] directions = {"LEFT", "RIGHT"};

        if (minSteps > 0) {
            int directionIndex = isLeftCloser ? 0 : 1;
            for (int i = 0; i < minSteps; i++) {
                commands.add(directions[directionIndex]);
            }
        }

        String processedString = isLeftCloser ? v : new StringBuilder(v).reverse().toString();
        for (char c : processedString.toCharArray()) {
            commands.add("PRINT " + c);
            int directionIndex = isLeftCloser ? 1 : 0;
            commands.add(directions[directionIndex]);
        }

        if (!commands.isEmpty()) {
            commands.remove(commands.size() - 1);
        }

        for (String command : commands) {
            System.out.println(command);
        }
    }
}

