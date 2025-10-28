To solve this problem, we need to determine the correct action based on the input number's decimal part. The solution involves checking specific conditions of the input number and then either rounding the number, keeping it as is, or indicating a specific message.

### Approach
1. **Input Handling**: Read the input number as a string and split it into the integer part and the decimal part using the dot (.) as the delimiter.
2. **Check Conditions**:
   - If the last digit of the integer part is '9', output the message "GOTO Vasilisa."
   - If the first digit of the decimal part is less than 5, output the integer part as is.
   - Otherwise, increment the integer part by 1 and output the result.

### Solution Code

import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        String[] parts = l.split("\\.");
        char[] s = parts[0].toCharArray();
        char[] p = parts[1].toCharArray();
        int i = Character.getNumericValue(p[0]);
        if (s[s.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (i < 5) {
            System.out.println(new String(s));
        } else {
            int num = Integer.parseInt(new String(s));
            num++;
            System.out.println(num);
        }
    }
}


### Explanation
1. **Reading Input**: The input is read as a string and split into two parts using the dot as a delimiter. This separates the integer part (s) and the decimal part (p).
2. **Character Conversion**: The integer part is converted to a character array to easily access the last digit. The first character of the decimal part is converted to an integer to check its value.
3. **Condition Checks**:
   - If the last digit of the integer part is '9', the message "GOTO Vasilisa." is printed.
   - If the first digit of the decimal part is less than 5, the integer part is printed as is.
   - If the first digit of the decimal part is 5 or greater, the integer part is incremented by 1 and printed.

This approach efficiently handles all specified conditions and ensures the correct output based on the input's structure.
