
import java.util.Scanner;

public class s855969677 {

    public static int determineOutput(String s) {
        if (s.equals("RRR")) {
            return 3;
        } else if (s.equals("SSS")) {
            return 0;
        } else if (s.equals("RRS") || s.equals("SRR")) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(determineOutput(input));
        scanner.close();
    }
}

