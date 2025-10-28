
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {
    private String result = "";
    private int t = 0;
    private List<int[]> queries = new ArrayList<>();

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();
        for (int i = 0; i < this.t; i++) {
            int[] query = new int[3];
            query[0] = scanner.nextInt();
            query[1] = scanner.nextInt();
            query[2] = scanner.nextInt();
            this.queries.add(query);
        }
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (int[] query : this.queries) {
            int k = query[0] / query[1];
            if (k * query[2] >= query[0]) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        this.result = String.join("\n", res);
    }

    public String getResult() {
        return this.result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}

