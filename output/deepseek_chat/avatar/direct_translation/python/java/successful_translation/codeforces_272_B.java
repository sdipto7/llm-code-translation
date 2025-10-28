import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] sequence = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }
        System.out.println(nPairWithCommonFX(sequence));
    }

    public static int nPairWithCommonFX(int[] sequence) {
        HashMap<Integer, ArrayList<Integer>> storage = new HashMap<>();
        ArrayList<Integer> FXs = new ArrayList<>();
        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                storage.put(y, list);
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int y : FXs) {
            int size = storage.get(y).size();
            sum1 += size * size;
            sum2 += size;
        }
        return (sum1 - sum2) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 1) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}
