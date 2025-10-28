import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class codeforces_327_A {
    public static List<Integer> find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next().replace("", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                Set<List<Integer>> combs = new HashSet<>(combinations(indices, 2));
                for (List<Integer> x : combs) {
                    int value = 2 + 2 * (Math.abs(indices.indexOf(x.get(0)) - indices.indexOf(x.get(1))) - 1) - (Math.abs(x.get(0) - x.get(1)) - 1);
                    if (value > maximum) {
                        maximum = value;
                    }
                }
                System.out.println(Collections.frequency(Arrays.asList(s.split("")), "1") + maximum);
            }
        }
        scanner.close();
    }

    private static Set<List<Integer>> combinations(List<Integer> list, int k) {
        Set<List<Integer>> result = new HashSet<>();
        combinationsHelper(list, k, 0, new ArrayList<>(), result);
        return result;
    }

    private static void combinationsHelper(List<Integer> list, int k, int start, List<Integer> tempList, Set<List<Integer>> result) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < list.size(); i++) {
            tempList.add(list.get(i));
            combinationsHelper(list, k, i + 1, tempList, result);
            tempList.remove(tempList.size() - 1);
        }
    }
}
