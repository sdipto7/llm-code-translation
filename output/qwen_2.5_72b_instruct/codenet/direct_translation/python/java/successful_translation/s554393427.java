import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[][] mo = new double[N][2];
        for (int i = 0; i < N; i++) {
            mo[i][0] = scanner.nextDouble();
            mo[i][1] = scanner.next().equals("JPY") ? 1 : 380000;
        }
        double okz = 0;
        for (int i = 0; i < N; i++) {
            okz += mo[i][0] * mo[i][1];
        }
        System.out.println(okz);
        scanner.close();
    }
}
