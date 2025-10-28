
import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> a = new ArrayList<>();
        
        reader.readLine(); // Read and ignore the first line
        String[] numbers = reader.readLine().split(" ");
        
        for (String number : numbers) {
            a.add(Integer.parseInt(number));
        }
        
        Collections.sort(a);

        boolean hasNonDivisible = false;
        int smallest = a.get(0);
        
        for (int x : a) {
            if (x % smallest != 0) {
                hasNonDivisible = true;
                break;
            }
        }
        
        int result = hasNonDivisible ? -1 : smallest;
        System.out.println(result);
    }
}

