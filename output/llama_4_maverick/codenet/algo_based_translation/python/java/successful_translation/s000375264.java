
import java.util.Scanner;

public class s000375264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int X = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int answer = calculateAnswer(X, t);
        System.out.println(answer);
    }

    public static int calculateAnswer(int X, int t) {
        int answer;
        if (X > t) {
            answer = X - t;
        } else {
            answer = 0;
        }
        return answer;
    }
}

