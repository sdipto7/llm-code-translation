
import java.util.Scanner;

public class s500828884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int individualCost = n * a;
        int minimumCost = Math.min(individualCost, b);
        System.out.println(minimumCost);
    }
}

