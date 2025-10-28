
import java.util.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> A = new ArrayList<>();
        for (String s : input) {
            A.add(Integer.parseInt(s));
        }
        A = new ArrayList<>(Arrays.asList(A.get(0)));
        for (int i = 1; i < input.length; i++) {
            if (Integer.parseInt(input[i - 1]) >= Integer.parseInt(input[i])) {
                A.add(Integer.parseInt(input[i]));
            }
        }
        int N = A.size();

        System.out.println(bis(0, N, A));
    }

    private static List<Map.Entry<Integer, Integer>> cut(List<Map.Entry<Integer, Integer>> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).getKey()) {
            return new ArrayList<>(Arrays.asList(new AbstractMap.SimpleEntry<>(index, array.get(0).getValue())));
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1).getKey() < index) {
                List<Map.Entry<Integer, Integer>> result = new ArrayList<>(array.subList(0, i));
                result.add(new AbstractMap.SimpleEntry<>(index, array.get(i).getValue()));
                return result;
            }
        }
        return array;
    }

    private static boolean isPossible(int K, List<Integer> A) {
        List<Map.Entry<Integer, Integer>> dp = new ArrayList<>();
        dp.add(new AbstractMap.SimpleEntry<>(A.get(0), 0));
        for (int a : A.subList(1, A.size())) {
            if (a <= dp.get(dp.size() - 1).getKey()) {
                dp = cut(dp, a);
            } else {
                dp.add(new AbstractMap.SimpleEntry<>(a, 0));
            }
            boolean isAdd = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).getValue() < K - 1) {
                    dp = cut(dp, dp.get(j).getKey() - 1);
                    dp.add(new AbstractMap.SimpleEntry<>(dp.get(j).getKey(), dp.get(j).getValue() + 1));
                    if (dp.get(dp.size() - 1).getKey() < a) {
                        dp.add(new AbstractMap.SimpleEntry<>(a, 0));
                    }
                    isAdd = true;
                    break;
                }
            }
            if (!isAdd) {
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

