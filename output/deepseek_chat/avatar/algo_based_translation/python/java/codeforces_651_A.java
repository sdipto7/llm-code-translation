
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int temp = (y - x) % 3;
        int addition = temp > 0 ? 1 : 0;
        int result = Math.max(x + y - 3 + addition, 0);
        System.out.println(result);
    }
    
    public static int num_inp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public static int[] arr_inp() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }
    
    public static int[] sp_inp() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    public static String str_inp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

