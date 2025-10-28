
import java.util.Scanner;

public class s855969677 {
    public static void main(String[] args) {
        System.out.println(determine_output());
    }

    public static int determine_output() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

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

