
import java.util.*;

public class codeforces_397_B {
    private String result;
    private int t;
    private List<List<Integer>> queries;

    public CodeforcesTask397BSolution() {
        result = "";
        t = 0;
        queries = new ArrayList<>();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> query = new ArrayList<>();
            for (String part : parts) {
                query.add(Integer.parseInt(part));
            }
            queries.add(query);
        }
        scanner.close();
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (List<Integer> query : queries) {
            int k = query.get(0) / query.get(1);
            if (k * query.get(2) >= query.get(0)) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        result = String.join("\n", res);
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}

