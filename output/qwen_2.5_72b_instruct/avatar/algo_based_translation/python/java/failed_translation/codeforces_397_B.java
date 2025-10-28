
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CodeforcesTask397BSolution {
    private String result;
    private int t;
    private List<List<Integer>> queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new ArrayList<>();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();
        for (int i = 0; i < this.t; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            this.queries.add(query);
        }
        scanner.close();
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (List<Integer> query : this.queries) {
            int k = query.get(0) / query.get(1);
            if (k * query.get(2) >= query.get(0)) {
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

