
import java.util.Scanner;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        int[] a = readAndSumArray(scanner);
        int[] b = readAndSumArray(scanner);
        int[] c = readAndSumArray(scanner);
        
        int x = sumArray(a);
        int y = sumArray(b);
        int z = sumArray(c);
        
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
    
    private static int[] readAndSumArray(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        return arr;
    }
    
    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

