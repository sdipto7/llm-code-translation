
import java.util.Scanner;
import java.util.Arrays;

public class s747093551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.nextLine();
        
        int[] x = Arrays.stream(scanner.nextLine().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        
        int[] y = Arrays.stream(scanner.nextLine().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        
        int maxX = Math.max(Arrays.stream(x).max().getAsInt(), X);
        int minY = Math.min(Arrays.stream(y).min().getAsInt(), Y);
        
        System.out.println(maxX < minY ? "No War" : "War");
    }
}

