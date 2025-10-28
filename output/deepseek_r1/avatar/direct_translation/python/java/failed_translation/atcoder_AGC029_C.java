
import java.util.*;

public class atcoder_AGC029_C {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private static List<Pair> cut(List<Pair> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (array.isEmpty()) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).first) {
            List<Pair> result = new ArrayList<>();
            result.add(new Pair(index, array.get(0).second));
            return result;
        }
        for (int i = array.size() - 1; i >= 1; i--) {
            if (array.get(i - 1).first < index) {
                List<Pair> newList = new ArrayList<>(array.subList(0, i));
                newList.add(new Pair(index, array.get(i).second));
                return newList;
            }
        }
        return new ArrayList<>();
    }

    private static boolean isPossible(int K, List<Integer> A) {
        if (A.isEmpty()) {
            return true;
        }
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
                Pair current = dp.get(j);
                if (current.second < K - 1) {
                    List<Pair> newDp = cut(dp, current.first - 1);
                    newDp.add(new Pair(current.first, current.second + 1));
                    if (newDp.isEmpty() || newDp.get(newDp.size() - 1).first < a) {
                        newDp.add(new Pair(a, 0));
                    }
                    dp = newDp;
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
        }
        int mid = (x + y) / 2;
        if (isPossible(mid, A)) {
            return bis(x, mid, A);
        } else {
            return bis(mid, y, A);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        List<Integer> inputList = new ArrayList<>();
        for (String token : tokens) {
            inputList.add(Integer.parseInt(token));
        }
        List<Integer> A = new ArrayList<>();
        if (!inputList.isEmpty()) {
            A.add(inputList.get(0));
            for (int i = 1; i < inputList.size(); i++) {
                if (inputList.get(i - 1) >= inputList.get(i)) {
                    A.add(inputList.get(i));
                }
            }
        }
        int N = A.size();
        System.out.println(bis(0, N, A));
    }
}

