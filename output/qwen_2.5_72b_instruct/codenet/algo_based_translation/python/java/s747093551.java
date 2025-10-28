
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class s747093551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            x.add(scanner.nextInt());
        }
        
        for (int i = 0; i < M; i++) {
            y.add(scanner.nextInt());
        }
        
        int maxX = Math.max(Collections.max(x), X);
        int minY = Math.min(Collections.min(y), Y);
        
        if (maxX < minY) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
        
        scanner.close();
    }
}

