
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s142939923 {

    public static int calculateMaxOperation(int a, int b) {
        List<Integer> results = new ArrayList<>();
        results.add(a + b);
        results.add(a - b);
        results.add(a * b);
        return results.stream().max(Integer::compare).get();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int maxResult = calculateMaxOperation(a, b);
        System.out.println(maxResult);
    }
}

