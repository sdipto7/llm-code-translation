
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int length = arr[0];
        int[] subArray = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(subArray);
        if (length % subArray[0] == 0) {
            System.out.println(length / subArray[0]);
            return;
        }
        int ans = 0;
        if (subArray[0] == subArray[1]) {
            int k = 0;
            for (int i = 0; i <= length / subArray[2]; i++) {
                int check = length - i * subArray[2];
                if (check >= 0 && check % subArray[0] == 0) {
                    k = check / subArray[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / subArray[2]; i++) {
                for (int j = 0; j <= length / subArray[1]; j++) {
                    int check = length - i * subArray[2] - j * subArray[1];
                    if (check >= 0 && check % subArray[0] == 0) {
                        k = check / subArray[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

