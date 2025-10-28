import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Double> x = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            input = input.replace("JPY", "* 1.0").replace("BTC", "* 380000.0");
            double value = Double.parseDouble(new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(input).toString());
            x.add(value);
        }
        double sum = 0.0;
        for (double num : x) {
            sum += num;
        }
        System.out.println(sum);
    }
}
