
import java.util.Scanner;

public class atcoder_ABC169_C {
    private static boolean debugEnabled = false;

    private static void debugPrint(Object... items) {
        if (debugEnabled) {
            StringBuilder sb = new StringBuilder();
            for (Object item : items) {
                sb.append(item).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    public static void main(String[] args) {
        debugEnabled = System.getenv().containsKey("TERM_PROGRAM");
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split("\\s+");
        String sa = inputParts[0];
        String sb = inputParts[1];

        long a = Long.parseLong(sa);
        double decimalPart = Double.parseDouble(sb);
        long b = (long) (decimalPart * 100 + 0.1);

        long result = (a * b) / 100;
        System.out.println(result);
    }
}

