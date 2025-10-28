
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> AList = Arrays.stream(inputArray).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> filteredList = new ArrayList<>();
        filteredList.add(AList.get(0));
        for (int i = 0; i < AList.size() - 1; i++) {
            if (AList.get(i) >= AList.get(i + 1)) {
                filteredList.add(AList.get(i + 1));
            }
        }
        int N = filteredList.size();
        List<Integer> A = filteredList;
        
        System.out.println(bis(0, N, A));
    }
    
    private static List<Pair> cut(List<Pair> array, int index) {
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
        return array;
    }
    
    private static boolean isPossible(int K, List<Integer> A) {
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
                    List<Pair> newDp = cut(dp, dp.get(j).first - 1);
                    newDp.add(new Pair(dp.get(j).first, dp.get(j).second + 1));
                    dp = newDp;
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
    
    private static int bis(int x, int y, List<Integer> A) {
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
        
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

