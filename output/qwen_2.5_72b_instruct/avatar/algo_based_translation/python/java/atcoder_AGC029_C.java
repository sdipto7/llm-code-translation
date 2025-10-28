
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
        List<Integer> tempA = new ArrayList<>();
        tempA.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i - 1) >= A.get(i)) {
                tempA.add(A.get(i));
            }
        }
        A = tempA;
        int N = A.size();
        System.out.println(bis(0, N));
    }

    public static List<Tuple> cut(List<Tuple> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).first) {
            List<Tuple> result = new ArrayList<>();
            result.add(new Tuple(index, array.get(0).second));
            return result;
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1).first < index) {
                List<Tuple> result = new ArrayList<>(array.subList(0, i));
                result.add(new Tuple(index, array.get(i).second));
                return result;
            }
        }
        return array;
    }

    public static boolean is_possible(int K) {
        List<Tuple> dp = new ArrayList<>();
        dp.add(new Tuple(A.get(0), 0));
        for (int a : A.subList(1, A.size())) {
            if (a <= dp.get(dp.size() - 1).first) {
                dp = cut(dp, a);
            } else {
                dp.add(new Tuple(a, 0));
            }
            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).second < K - 1) {
                    dp = cut(dp, dp.get(j).first - 1);
                    dp.add(new Tuple(dp.get(dp.size() - 1).first, dp.get(dp.size() - 1).second + 1));
                    if (dp.get(dp.size() - 1).first < a) {
                        dp.add(new Tuple(a, 0));
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

    public static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (is_possible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }

    static class Tuple {
        int first;
        int second;

        Tuple(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static List<Integer> A;
}

