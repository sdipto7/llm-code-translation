import java.util.Scanner;
public class s592421258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().repeat(2);
        System.out.println(s.contains(scanner.nextLine()) ? "Yes" : "No");
    }
}
