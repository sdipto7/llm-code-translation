
import java.util.Scanner;

public class s151217193 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int G = scanner.nextInt();
        
        int result = calculateValue(R, G);
        
        System.out.println(result);
    }

    public static int calculateValue(int R, int G) {
        return G * 2 - R;
    }
}

