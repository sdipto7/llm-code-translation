
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class atcoder_ABC142_A {
    public static int nextInt() {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        return Integer.parseInt(inputStr);
    }
    
    public static List<Integer> nextInts() {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] splitStr = inputStr.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : splitStr) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = nextInt();
        int t = 0;
        
        for (int i = 0; i < n; i++) {
            int condition = (i + 1) & 1;
            if (condition != 0) {
                t++;
            }
        }
        
        double result = (double) t / n;
        System.out.println(result);
    }
}

