
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC029_C {
    private static List<Integer> A;

    private static class Pair {
        public final int value;
        public final int count;

        public Pair(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    private static List<Pair> cut(List<Pair> list, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= list.get(0).value) {
            List<Pair> result = new ArrayList<>();
            result.add(new Pair(index, list.get(0).count));
            return result;
        }
        for (int i = list.size() - 1; i >= 1; i--) {
            if (list.get(i - 1).value < index) {
                List<Pair> newList = new ArrayList<>(list.subList(0, i));
                newList.add(new Pair(index, list.get(i).count));
                return newList;
            }
        }
        return new ArrayList<>();
    }

    private static boolean isPossible(int K) {
        List<Pair> dp = new ArrayList<>();
        dp.add(new Pair(A.get(0), 0));
        for (int i = 1; i < A.size(); i++) {
            int a = A.get(i);
            if (a <= dp.get(dp.size() - 1).value) {
                dp = cut(dp, a);
            } else {
                dp.add(new Pair(a, 0));
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                Pair current = dp.get(j);
                if (current.count < K - 1) {
                    List<Pair> newSeg = cut(dp, current.value - 1);
                    newSeg.add(new Pair(current.value, current.count + 1));
                    if (newSeg.get(newSeg.size() - 1).value < a) {
                        newSeg.add(new Pair(a, 0));
                    }
                    dp = newSeg;
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

    private static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        }
        int mid = (x + y) / 2;
        if (isPossible(mid)) {
            return bis(x, mid);
        } else {
            return bis(mid, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> originalA = new ArrayList<>();
        for (String s : input) {
            originalA.add(Integer.parseInt(s));
        }

        List<Integer> processedA = new ArrayList<>();
        processedA.add(originalA.get(0));
        for (int i = 1; i < originalA.size(); i++) {
            int prev = originalA.get(i - 1);
            int current = originalA.get(i);
            if (prev >= current) {
                processedA.add(current);
            }
        }
        A = processedA;
        int N = A.size();
        System.out.println(bis(0, N));
    }
}

