
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
        int[] sizes = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(sizes);
        if (length % sizes[0] == 0) {
            System.out.println(length / sizes[0]);
            return;
        }
        int ans = 0;
        if (sizes[0] == sizes[1]) {
            for (int i = 0; i <= length / sizes[2]; i++) {
                int check = length - i * sizes[2];
                if (check >= 0 && check % sizes[0] == 0) {
                    int k = check / sizes[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            for (int i = 0; i <= length / sizes[2]; i++) {
                for (int j = 0; j <= length / sizes[1]; j++) {
                    int check = length - i * sizes[2] - j * sizes[1];
                    if (check >= 0 && check % sizes[0] == 0) {
                        int k = check / sizes[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

