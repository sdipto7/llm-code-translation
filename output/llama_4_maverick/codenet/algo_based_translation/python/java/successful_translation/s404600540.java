
import java.util.Scanner;

public class s404600540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int q = Integer.parseInt(inputs[0]);
        int h = Integer.parseInt(inputs[1]);
        int s = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);
        int n = scanner.nextInt();
        scanner.close();

        int min_1 = Math.min(Math.min(q*4, h*2), Math.min(q*2+h, s));
        int min_2 = Math.min(min_1*2, d);

        int result = (n % 2)*min_1 + (n / 2)*min_2;
        System.out.println(result);
    }
}

