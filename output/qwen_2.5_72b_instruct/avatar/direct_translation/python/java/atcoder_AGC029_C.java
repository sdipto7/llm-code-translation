
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        List<Integer> A = new ArrayList<>();
        for (String s : input) {
            A.add(Integer.parseInt(s));
        }
        A = new ArrayList<>(List.of(A.get(0)));
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) >= A.get(i + 1)) {
                A.add(A.get(i + 1));
            }
        }
        int N = A.size();
        System.out.println(bis(0, N));
    }

    static List<int[]> cut(List<int[]> array, int index) {
        List<int[]> result = new ArrayList<>();
        if (index < 1) {
            return result;
        }
        if (index <= array.get(0)[0]) {
            result.add(new int[]{index, array.get(0)[1]});
            return result;
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1)[0] < index) {
                result.addAll(array.subList(0, i));
                result.add(new int[]{index, array.get(i)[1]});
                return result;
            }
        }
        return result;
    }

    static boolean is_possible(int K) {
        List<int[]> dp = new ArrayList<>();
        dp.add(new int[]{A.get(0), 0});
        for (int i = 1; i < A.size(); i++) {
            int a = A.get(i);
            if (a <= dp.get(dp.size() - 1)[0]) {
                dp = cut(dp, a);
            } else {
                dp.add(new int[]{a, 0});
            }
            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = cut(dp, dp.get(j)[0] - 1);
                    dp.add(new int[]{dp.get(dp.size() - 1)[0], dp.get(dp.size() - 1)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < a) {
                        dp.add(new int[]{a, 0});
                    }
                    is_added = true;
                    break;
                }
            }
            if (!is_added) {
                return false;
            }
        }
        return true;
    }

    static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (is_possible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}

