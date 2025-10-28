
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {
    private String result;
    private int testCaseCount;
    private List<List<Integer>> queryList;
    private List<String> resultsList;

    public ProblemSolution() {
        initialize();
    }

    private void initialize() {
        result = "";
        testCaseCount = 0;
        queryList = new ArrayList<>();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        testCaseCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < testCaseCount; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> query = new ArrayList<>();
            query.add(Integer.parseInt(parts[0]));
            query.add(Integer.parseInt(parts[1]));
            query.add(Integer.parseInt(parts[2]));
            queryList.add(query);
        }
        scanner.close();
    }

    public void processQueries() {
        resultsList = new ArrayList<>();
        for (List<Integer> query : queryList) {
            int n = query.get(0);
            int l = query.get(1);
            int r = query.get(2);
            
            int k = n / l;
            boolean valid = k * r >= n;
            resultsList.add(valid ? "Yes" : "No");
        }
        result = String.join("\n", resultsList);
    }

    public String getOutput() {
        return result;
    }

    public static void main(String[] args) {
        ProblemSolution solution = new ProblemSolution();
        solution.readInput();
        solution.processQueries();
        System.out.println(solution.getOutput());
    }
}

