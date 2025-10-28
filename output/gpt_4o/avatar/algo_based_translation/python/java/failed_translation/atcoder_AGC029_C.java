
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC029_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user (this input is ignored)
        scanner.nextLine();

        // Read an integer list `A` from user input
        List<Integer> A = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            A.add(Integer.parseInt(s));
        }

        // Transform `A`
        List<Integer> transformedA = new ArrayList<>();
        transformedA.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i - 1) >= A.get(i)) {
                transformedA.add(A.get(i));
            }
        }

        // Define `N` as the length of transformed `A`
        int N = transformedA.size();

        // Print the result of `bis(0, N)`
        System.out.println(bis(transformedA, 0, N));
    }

    private static List<int[]> cut(List<int[]> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0)[0]) {
            List<int[]> result = new ArrayList<>();
            result.add(new int[]{index, array.get(0)[1]});
            return result;
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1)[0] < index) {
                List<int[]> result = new ArrayList<>(array.subList(0, i));
                result.add(new int[]{index, array.get(i)[1]});
                return result;
            }
        }
        return new ArrayList<>();
    }

    private static boolean isPossible(List<Integer> A, int K) {
        List<int[]> dp = new ArrayList<>();
        dp.add(new int[]{A.get(0), 0});
        for (int i = 1; i < A.size(); i++) {
            int a = A.get(i);
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

    private static int bis(List<Integer> A, int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (isPossible(A, (x + y) / 2)) {
            return bis(A, x, (x + y) / 2);
        } else {
            return bis(A, (x + y) / 2, y);
        }
    }
}

