
import java.util.Scanner;

public class s893778513 {
    public static void checkCondition() {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] strArray = scanner.nextLine().split(" ");
        int[] l = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            l[i] = Integer.parseInt(strArray[i]);
        }
        int b = Integer.MIN_VALUE;
        int s = 0;
        for (int i : l) {
            if (i > b) {
                b = i;
            }
            s += i;
        }
        if (b < s - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        checkCondition();
    }
}

