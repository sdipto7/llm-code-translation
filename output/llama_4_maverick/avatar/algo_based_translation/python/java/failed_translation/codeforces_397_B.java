
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {
    private String result;
    private int t;
    private List<int[]> queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new ArrayList<>();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            query[0] = scanner.nextInt();
            query[1] = scanner.nextInt();
            query[2] = scanner.nextInt();
            this.queries.add(query);
        }
        scanner.close();
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (int[] query : queries) {
            int k = query[0] / query[1];
            res.add(k * query[2] >= query[0] ? "Yes" : "No");
        }
        StringBuilder sb = new StringBuilder();
        for (String s : res) {
            sb.append(s).append("\n");
        }
        this.result = sb.toString().trim();
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

