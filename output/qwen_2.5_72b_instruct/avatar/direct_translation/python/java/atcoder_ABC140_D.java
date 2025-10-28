import java.util.*;
import java.util.stream.*;

class Main {
    static Scanner scanner = new Scanner(System.in);
    static Iterator<String> inputParser;

    public static void main(String[] args) {
        inputParser = parser().iterator();
        int N = gi();
        int K = gi();
        String S = gw();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (!S.substring(i, i + 1).equals(S.substring(i + 1, i + 2))) {
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

    static Iterable<String> parser() {
        List<String> data = new ArrayList<>();
        while (true) {
            data.addAll(Arrays.asList(scanner.nextLine().split(" ")));
            for (String number : data) {
                if (number.length() > 0) {
                    yield number;
                }
            }
            data.clear();
        }
    }

    static String gw() {
        return inputParser.next();
    }

    static int gi() {
        return Integer.parseInt(gw());
    }
}
