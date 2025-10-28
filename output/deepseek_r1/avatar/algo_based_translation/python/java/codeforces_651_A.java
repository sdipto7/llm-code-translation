
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_651_A {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] inputs = scanner.nextLine().split("\\s+");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        int temp1 = (y - x) % 3;
        if (temp1 < 0) temp1 += 3;
        int conditionResult = temp1 > 0 ? 1 : 0;
        int sumVal = x + y - 3 + conditionResult;
        System.out.println(Math.max(sumVal, 0));
    }

    public static int numInp() {
        return scanner.nextInt();
    }

    public static List<Integer> arrInp() {
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    public static int[] spInp() {
        String[] parts = scanner.nextLine().split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }

    public static String strInp() {
        return scanner.nextLine();
    }
}

