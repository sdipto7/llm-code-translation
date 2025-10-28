
import java.util.Scanner;

public class s855969677 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        determineOutput(s);
        scanner.close();
    }

    public static void determineOutput(String s) {
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("SSS")) {
            System.out.println(0);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}

