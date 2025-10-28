
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC119_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer N from input
        int N = Integer.parseInt(scanner.nextLine());

        // Initialize a list to store converted currency values
        List<Double> x = new ArrayList<>();

        // Loop to process each currency entry
        for (int i = 0; i < N; i++) {
            // Read a string from input
            String inputString = scanner.nextLine();

            // Replace 'JPY' with '* 1.0' and 'BTC' with '* 380000.0'
            String convertedString = inputString.replace("JPY", "* 1.0").replace("BTC", "* 380000.0");

            // Evaluate the expression to convert to double
            double currencyValue = evaluateExpression(convertedString);

            // Add the currencyValue to the list x
            x.add(currencyValue);
        }

        // Calculate the sum of all elements in x
        double totalValue = 0.0;
        for (double value : x) {
            totalValue += value;
        }

        // Output the totalValue
        System.out.println(totalValue);

        scanner.close();
    }

    private static double evaluateExpression(String expression) {
        String[] parts = expression.split("\\*");
        return Double.parseDouble(parts[0].trim()) * Double.parseDouble(parts[1].trim());
    }
}

