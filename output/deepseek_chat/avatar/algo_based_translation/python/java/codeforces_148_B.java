import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double princess = scanner.nextDouble();
        double dragon = scanner.nextDouble();
        double t = scanner.nextDouble();
        double f = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (dragon <= princess) {
            System.out.println(0);
            System.exit(0);
        }
        
        int result = 0;
        double position = t * princess;
        position += princess * position / (dragon - princess);
        
        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        
        System.out.println(result);
    }
}
