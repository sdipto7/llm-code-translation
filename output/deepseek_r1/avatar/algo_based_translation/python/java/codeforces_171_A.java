
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().trim().split(" ");
        String a = numbers[0];
        String b = numbers[1];
        
        int maxLength = Math.max(a.length(), b.length());
        
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%-" + maxLength + "s", b).replace(' ', '0');
        
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        for (int i = 0; i < maxLength; i++) {
            int digitA = Character.getNumericValue(a.charAt(maxLength - i - 1));
            int digitB = Character.getNumericValue(b.charAt(i));
            int sum = digitA + digitB + carry;
            
            if (sum > 9) {
                result.append(sum % 10);
                carry = 1;
            } else {
                result.append(sum);
                carry = 0;
            }
        }
        
        if (carry == 1) {
            result.append('1');
        }
        
        System.out.println(Integer.parseInt(result.reverse().toString()));
    }
}

