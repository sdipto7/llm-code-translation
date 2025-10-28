import java.util.Scanner;

public class s147181072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_str = scanner.nextLine();
        String result = input_str.swapcase();
        System.out.println(result);
    }
}

class String {
    public String swapcase() {
        StringBuilder swapped = new StringBuilder(this);
        for (int i = 0; i < swapped.length(); i++) {
            char c = swapped.charAt(i);
            if (Character.isUpperCase(c)) {
                swapped.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return swapped.toString();
    }
}
