
import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] vInput = scanner.nextLine().split(" ");
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(vInput[i]);
        }
        
        String[] cInput = scanner.nextLine().split(" ");
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(cInput[i]);
        }
        
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(0);
        int ans = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < n; i++) {
            if (v[i] - c[i] > 0) {
                x = v[i];
                y = c[i];
                resultList.add(x - y);
            }
        }
        
        int sum = 0;
        for (int num : resultList) {
            sum += num;
        }
        
        System.out.println(sum);
    }
}

