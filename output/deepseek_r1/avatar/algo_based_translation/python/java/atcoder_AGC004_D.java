
import java.util.*;

public class atcoder_AGC004_D {
    private static class Result {
        int height;
        int cuts;

        Result(int height, int cuts) {
            this.height = height;
            this.cuts = cuts;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] parentInput = new int[n];
        for (int i = 0; i < n; i++) {
            parentInput[i] = sc.nextInt();
        }

        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int node = 0; node < n; node++) {
            int parent = parentInput[node] - 1;
            tree.get(parent).add(node);
        }

        Result rootResult = dfs(tree, n, k, 0, 0);
        int answer = rootResult.cuts;

        if (parentInput[0] != 1) {
            answer++;
        }

        System.out.println(answer);
    }

    private static Result dfs(List<List<Integer>> tree, int n, int k, int current, int parent) {
        int maxHeight = 0;
        int totalCuts = 0;

        for (int child : tree.get(current)) {
            if (child == 0) continue;
            Result childResult = dfs(tree, n, k, child, current);
            maxHeight = Math.max(maxHeight, childResult.height);
            totalCuts += childResult.cuts;
        }

        maxHeight++;
        if (parent != 0 && maxHeight == k) {
            maxHeight = 0;
            totalCuts++;
        }

        return new Result(maxHeight, totalCuts);
    }
}

