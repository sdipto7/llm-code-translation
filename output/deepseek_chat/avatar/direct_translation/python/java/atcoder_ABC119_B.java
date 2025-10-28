
import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            input = input.replace("JPY", "* 1.0").replace("BTC", "* 380000.0");
            sum += Double.parseDouble(String.valueOf(new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(input)));
        }
        System.out.println(sum);
    }
}

