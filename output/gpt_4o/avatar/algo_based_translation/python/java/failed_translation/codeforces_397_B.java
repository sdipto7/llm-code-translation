
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
        this.t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < this.t; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            int[] query = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                query[j] = Integer.parseInt(inputLine[j]);
            }
            this.queries.add(query);
        }
        scanner.close();
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

