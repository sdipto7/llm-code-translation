import java.util.Scanner;

public class s592421258 {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        String temp_input = I.nextLine();
        String s = temp_input + temp_input;
        String secondInput = I.nextLine();
        String[] result = {"No", "Yes"};
        int index = s.contains(secondInput) ? 1 : 0;
        System.out.println(result[index]);
    }
}
