
import java.util.Scanner;

public class s122565091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int a = Integer.parseInt(firstLine[0]);
        int v = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = scanner.nextLine().split(" ");
        int b = Integer.parseInt(secondLine[0]);
        int w = Integer.parseInt(secondLine[1]);
        
        int t = Integer.parseInt(scanner.nextLine());
        
        if (a == b) {
            System.out.println("YES");
        } else if (v <= w) {
            System.out.println("NO");
        } else {
            int delta = Math.abs(a - b);
            double requiredTime = (double) delta / (v - w);
            if (t < requiredTime) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

