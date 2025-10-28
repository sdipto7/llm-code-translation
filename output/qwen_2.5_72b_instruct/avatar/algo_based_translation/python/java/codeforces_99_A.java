
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        processInput(inputString);
        scanner.close();
    }

    public static void processInput(String inputString) {
        List<String> l = Arrays.asList(inputString.split("\\."));
        List<String> s = Arrays.asList(l.get(0).split(""));
        List<String> p = Arrays.asList(l.get(1).split(""));
        int i = Integer.parseInt(p.get(0));

        if (s.get(s.size() - 1).equals("9")) {
            System.out.println("GOTO Vasilisa.");
        } else if (!s.get(s.size() - 1).equals("9") && i < 5) {
            String result = String.join("", s);
            System.out.println(result);
        } else {
            String result = String.join("", s);
            int incrementedResult = Integer.parseInt(result) + 1;
            System.out.println(Integer.toString(incrementedResult));
        }
    }
}

