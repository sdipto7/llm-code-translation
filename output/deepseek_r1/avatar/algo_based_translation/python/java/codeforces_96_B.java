
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_96_B {
    private static ArrayList<Long> numbersList = new ArrayList<>();
    private static final long LIMIT = 10000000000L;

    private static void generateNumbers(long number, int fourCount, int sevenCount) {
        if (number > LIMIT) {
            return;
        }
        if (number > 0 && fourCount == sevenCount) {
            numbersList.add(number);
        }
        generateNumbers(number * 10 + 4, fourCount + 1, sevenCount);
        generateNumbers(number * 10 + 7, fourCount, sevenCount + 1);
    }

    public static void main(String[] args) {
        generateNumbers(0, 0, 0);
        Collections.sort(numbersList);
        
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long answer = 0;
        
        for (long val : numbersList) {
            if (val >= n) {
                answer = val;
                break;
            }
        }
        
        System.out.println(answer);
        scanner.close();
    }
}

