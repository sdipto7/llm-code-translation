
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        ArrayList<ArrayList<String>> inputLines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split("\\s+");
            ArrayList<String> currentLine = new ArrayList<>(Arrays.asList(parts));
            inputLines.add(currentLine);
        }
        
        int count = 0;
        for (ArrayList<String> currentList : inputLines) {
            for (ArrayList<String> comparisonList : inputLines) {
                if (currentList.equals(comparisonList)) {
                    continue;
                }
                if (currentList.get(0).equals(comparisonList.get(comparisonList.size() - 1))) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}

