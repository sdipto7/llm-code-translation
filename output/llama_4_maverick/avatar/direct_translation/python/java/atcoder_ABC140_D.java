
import java.util.Scanner;

public class atcoder_ABC140_D {
    static Scanner scanner = new Scanner(System.in);
    static String[] data;
    static int index;

    static String next() {
        if (data == null || index == data.length) {
            data = scanner.nextLine().split(" ");
            index = 0;
        }
        return data[index++];
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) {
        int N = nextInt();
        int K = nextInt();
        String S = next();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }
        int curHappy = N - 1 - segCnt;
        int ans;
        if (2 * K >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * K;
        }
        System.out.println(ans);
    }
}

