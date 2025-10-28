import java.util.Scanner;

public class s554858080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputList = input.split("\\s+");
        StringBuilder numBuilder = new StringBuilder();
        for (String s : inputList) {
            numBuilder.append(s);
        }
        String num = numBuilder.toString();
        int numInt = Integer.parseInt(num);
        if (numInt % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
