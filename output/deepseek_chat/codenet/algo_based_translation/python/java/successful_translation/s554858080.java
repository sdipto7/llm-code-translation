import java.util.Scanner;

public class s554858080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String num = String.join("", input);
        int number = Integer.parseInt(num);
        
        if (number % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
