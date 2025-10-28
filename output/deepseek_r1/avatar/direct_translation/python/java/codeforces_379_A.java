To solve this problem, we need to simulate the process of burning candles and using the leftover wax to form new candles. The goal is to determine the total number of candles that can be burned over time, including those made from the leftover wax.

### Approach
1. **Input Reading**: Read the initial number of whole candles (`candeleIntere`) and the number of leftover wax pieces (`b`) required to form a new candle.
2. **Simulation Loop**: Continue the process as long as there are whole candles left or enough leftover wax to form a new candle.
3. **Update Candles from Leftover Wax**: Convert the leftover wax into new whole candles when possible.
4. **Burn Candles**: Add the current number of whole candles to the total count of burned candles.
5. **Update Leftover Wax**: After burning, add the leftover wax from the burned candles to the leftover count.
6. **Repeat**: Continue the process until no more candles can be formed or burned.

### Solution Code

import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }
}


### Explanation
1. **Reading Input**: The initial number of whole candles (`candeleIntere`) and the required wax pieces (`b`) are read from the input.
2. **Loop Execution**: The loop runs as long as there are whole candles to burn or enough leftover wax to form a new candle.
3. **Forming New Candles**: Leftover wax is converted into new candles, updating the count of whole candles and reducing the leftover wax accordingly.
4. **Burning Candles**: The current number of whole candles is added to the total burned count (`s`).
5. **Updating Leftover Wax**: After burning, the leftover wax from the burned candles is added to the leftover count.
6. **Termination**: The loop terminates when no more candles can be formed or burned, and the total count of burned candles is printed.

This approach efficiently simulates the process, ensuring that all possible candles are burned, including those formed from the leftover wax, thus maximizing the total number of candles burned.
