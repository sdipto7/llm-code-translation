
import java.util.Scanner;

public class s855969677 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(countOccurrences(s));
    }

    public static int countOccurrences(String s) {
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
}

