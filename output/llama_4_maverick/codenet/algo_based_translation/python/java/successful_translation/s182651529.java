import java.util.Scanner;

public class s182651529 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        String[] scoresStr = scanner.nextLine().split(" ");
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(scoresStr[i]);
        }
        int mae = 0;
        int usiro = K;
        for (int i = 0; i < N - K; i++) {
            if (score[mae] < score[usiro]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            mae += 1;
            usiro += 1;
        }
        scanner.close();
    }
}
