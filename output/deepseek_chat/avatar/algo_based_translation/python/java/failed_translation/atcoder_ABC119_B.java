import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double[] x = new double[N];
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String processed = input.replace("JPY", "* 1.0").replace("BTC", "* 380000.0");
            x[i] = Double.parseDouble(engine.eval(processed).toString());
        }
        
        double sum = 0;
        for (double value : x) {
            sum += value;
        }
        System.out.println(sum);
    }
}
