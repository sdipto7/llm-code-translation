
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_189_A {

    public static void main(String[] args) {
        cutRibbon();
    }

    public static void cutRibbon() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        int length = arr[0];
        Arrays.sort(arr, 1, 4);
        
        if (length % arr[1] == 0) {
            System.out.println(length / arr[1]);
            return;
        }

        int ans = 0;
        if (arr[1] == arr[2]) {
            for (int i = 0; i <= length / arr[3]; i++) {
                int check = length - i * arr[3];
                if (check >= 0 && check % arr[1] == 0) {
                    int k = check / arr[1];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            for (int i = 0; i <= length / arr[3]; i++) {
                for (int j = 0; j <= length / arr[2]; j++) {
                    int check = length - i * arr[3] - j * arr[2];
                    if (check >= 0 && check % arr[1] == 0) {
                        int k = check / arr[1];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

