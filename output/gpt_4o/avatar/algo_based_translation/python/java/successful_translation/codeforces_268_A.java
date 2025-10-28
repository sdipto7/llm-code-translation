
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {

    public static int countMatchingPairs(int n, List<List<String>> inputs) {
        List<List<String>> q = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            q.add(inputs.get(i));
        }

        for (List<String> j : q) {
            for (List<String> k : q) {
                if (k == j) {
                    continue;
                } else if (j.get(0).equals(k.get(k.size() - 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<List<String>> inputs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArray = scanner.nextLine().split(" ");
            List<String> inputList = new ArrayList<>();
            for (String s : inputArray) {
                inputList.add(s);
            }
            inputs.add(inputList);
        }

        int result = countMatchingPairs(n, inputs);
        System.out.println(result);
    }
}

