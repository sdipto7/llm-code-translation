
import java.util.*;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int length = arr[0];
        int[] pieces = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(pieces);
        if (length % pieces[0] == 0) {
            System.out.println(length / pieces[0]);
            return;
        }
        int ans = 0;
        if (pieces[0] == pieces[1]) {
            for (int i = 0; i <= length / pieces[2]; i++) {
                int check = length - i * pieces[2];
                if (check >= 0 && check % pieces[0] == 0) {
                    int k = check / pieces[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            for (int i = 0; i <= length / pieces[2]; i++) {
                for (int j = 0; j <= length / pieces[1]; j++) {
                    int check = length - i * pieces[2] - j * pieces[1];
                    if (check >= 0 && check % pieces[0] == 0) {
                        int k = check / pieces[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

