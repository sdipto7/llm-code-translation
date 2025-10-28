
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        double sum = 0;
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            input = input.replace("JPY", "* 1.0");
            input = input.replace("BTC", "* 380000.0");
            sum += ((Number) engine.eval(input)).doubleValue();
        }
        System.out.println(sum);
    }
}

