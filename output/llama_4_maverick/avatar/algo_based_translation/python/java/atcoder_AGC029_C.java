
import java.util.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        List<Integer> filteredA = new ArrayList<>();
        filteredA.add(A[0]);
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] >= A[i]) {
                filteredA.add(A[i]);
            }
        }
        int N = filteredA.size();
        System.out.println(bis(0, N, filteredA));
    }

    public static List<Pair> cut(List<Pair> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).first) {
            List<Pair> result = new ArrayList<>();
            result.add(new Pair(index, array.get(0).second));
            return result;
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1).first < index) {
                List<Pair> result = new ArrayList<>(array.subList(0, i));
                result.add(new Pair(index, array.get(i).second));
                return result;
            }
        }
        return new ArrayList<>();
    }

    public static boolean isPossible(int K, List<Integer> A) {
        List<Pair> dp = new ArrayList<>();
        dp.add(new Pair(A.get(0), 0));
        for (int i = 1; i < A.size(); i++) {
            int a = A.get(i);
            if (a <= dp.get(dp.size() - 1).first) {
                dp = cut(dp, a);
            } else {
                dp.add(new Pair(a, 0));
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).second < K - 1) {
                    int val = dp.get(j).first;
                    dp = cut(dp, val - 1);
                    dp.add(new Pair(val, dp.get(dp.size() - 1).second + 1));
                    if (dp.get(dp.size() - 1).first < a) {
                        dp.add(new Pair(a, 0));
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

    public static int bis(int x, int y, List<Integer> A) {
        if (y == x + 1) {
            return y;
        } else if (isPossible((x + y) / 2, A)) {
            return bis(x, (x + y) / 2, A);
        } else {
            return bis((x + y) / 2, y, A);
        }
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

