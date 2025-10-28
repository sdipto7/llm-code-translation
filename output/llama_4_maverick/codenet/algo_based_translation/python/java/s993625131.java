
import java.util.Scanner;

public class s993625131 {
    public static int findLongestValidSequence(String sequence) {
        int count = 0;
        int record = 0;
        for (char character : sequence.toCharArray()) {
            if (character == 'A' || character == 'C' || character == 'G' || character == 'T') {
                count += 1;
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
        return record;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.next();
        int result = findLongestValidSequence(sequence);
        System.out.println(result);
        scanner.close();
    }
}

