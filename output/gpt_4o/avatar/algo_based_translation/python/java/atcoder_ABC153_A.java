
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        calculateShots();
    }

    public static void calculateShots() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        
        int sho = h / a;
        int am = h % a;
        
        if (am != 0) {
            sho += 1;
        }
        
        System.out.println(sho);
        
        scanner.close();
    }
}

