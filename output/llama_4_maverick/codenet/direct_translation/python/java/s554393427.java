
import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[][] mo = new double[N][2];
        String[] currency = new String[N];
        for (int i = 0; i < N; i++) {
            mo[i][0] = sc.nextDouble();
            currency[i] = sc.next();
        }
        double okz = 0;
        for (int i = 0; i < N; i++) {
            if (currency[i].equals("JPY")) {
                okz += mo[i][0];
            } else {
                okz += mo[i][0] * 380000;
            }
        }
        System.out.println(okz);
    }
}

