import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[][] mo = new double[N][2];
        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            String u = sc.next();
            mo[i][0] = x;
            mo[i][1] = u.equals("JPY") ? 1 : 380000;
        }
        double okz = 0;
        for (double[] i : mo) {
            if (i[1] == 1) {
                okz += i[0];
            } else {
                okz += i[0] * 380000;
            }
        }
        System.out.println(okz);
    }
}
