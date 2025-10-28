
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] aInput = scanner.nextLine().split(" ");
        int[] a = Arrays.stream(aInput).mapToInt(Integer::parseInt).toArray();
        
        String[] bInput = scanner.nextLine().split(" ");
        int[] b = Arrays.stream(bInput).mapToInt(Integer::parseInt).toArray();
        
        String[] cInput = scanner.nextLine().split(" ");
        int[] c = Arrays.stream(cInput).mapToInt(Integer::parseInt).toArray();
        
        int x = 0;
        for (int i : a) {
            x += i;
        }
        
        int y = 0;
        for (int i : b) {
            y += i;
        }
        
        int z = 0;
        for (int i : c) {
            z += i;
        }
        
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}

