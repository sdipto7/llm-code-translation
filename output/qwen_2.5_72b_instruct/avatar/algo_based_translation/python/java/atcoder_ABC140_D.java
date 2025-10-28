
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputParser inputParser = new InputParser(scanner);

        int MOD = 1000000007;
        int N = gi(inputParser);
        int K = gi(inputParser);
        String S = gw(inputParser);

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (!S.substring(i, i + 1).equals(S.substring(i + 1, i + 2))) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * K;
        }
        System.out.println(ans);
    }

    static class InputParser {
        private final Scanner scanner;
        private List<String> data;
        private int index;

        public InputParser(Scanner scanner) {
            this.scanner = scanner;
            this.data = new ArrayList<>();
            this.index = 0;
        }

        public String next() {
            if (index >= data.size()) {
                String line = scanner.nextLine();
                data = List.of(line.split(" "));
                index = 0;
            }
            return data.get(index++);
        }
    }

    static String gw(InputParser inputParser) {
        return inputParser.next();
    }

    static int gi(InputParser inputParser) {
        return Integer.parseInt(gw(inputParser));
    }
}

