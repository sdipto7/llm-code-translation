
import java.util.Scanner;

public class s993625131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        int record = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                count++;
            } else {
                if (count > record) {
                    record = count;
                }
                count = 0;
            }
        }
        if (count > record) {
            record = count;
        }
        System.out.println(record);
    }
}

