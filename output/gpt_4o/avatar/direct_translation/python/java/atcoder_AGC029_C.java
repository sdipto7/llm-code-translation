
import java.util.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> A = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            A.add(Integer.parseInt(s));
        }
        A = new ArrayList<>(Collections.singletonList(A.get(0)));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i - 1) >= A.get(i)) {
                A.add(A.get(i));
            }
        }
        int N = A.size();

        System.out.println(bis(0, N, A));
    }

    private static List<int[]> cut(List<int[]> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0)[0]) {
            return new ArrayList<>(Collections.singletonList(new int[]{index, array.get(0)[1]}));
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1)[0] < index) {
                List<int[]> result = new ArrayList<>(array.subList(0, i));
                result.add(new int[]{index, array.get(i)[1]});
                return result;
            }
        }
        return new ArrayList<>(array);
    }

    private static boolean isPossible(int K, List<Integer> A) {
        List<int[]> dp = new ArrayList<>();
        dp.add(new int[]{A.get(0), 0});
        for (int a : A.subList(1, A.size())) {
            if (a <= dp.get(dp.size() - 1)[0]) {
                dp = cut(dp, a);
            } else {
                dp.add(new int[]{a, 0});
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = cut(dp, dp.get(j)[0] - 1);
                    dp.add(new int[]{dp.get(j)[0], dp.get(j)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < a) {
                        dp.add(new int[]{a, 0});
                    }
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    private static int bis(int x, int y, List<Integer> A) {
        if (y == x + 1) {
            return y;
        } else if (isPossible((x + y) / 2, A)) {
            return bis(x, (x + y) / 2, A);
        } else {
            return bis((x + y) / 2, y, A);
        }
    }
}

