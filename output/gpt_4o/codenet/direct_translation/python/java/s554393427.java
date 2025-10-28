
import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        double[][] mo = new double[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            double x = Double.parseDouble(input[0]);
            String u = input[1];
            mo[i][0] = x;
            mo[i][1] = u.equals("JPY") ? 0 : 1;
        }

        double okz = 0;
        for (int i = 0; i < N; i++) {
            if (mo[i][1] == 0) {
                okz += mo[i][0];
            } else {
                okz += mo[i][0] * 380000;
            }
        }

        System.out.println(okz);
    }
}

