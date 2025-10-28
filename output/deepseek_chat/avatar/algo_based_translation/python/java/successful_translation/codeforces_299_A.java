
import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        
        String[] numbers = lines.get(1).split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String numStr : numbers) {
            nums.add(Integer.parseInt(numStr));
        }
        
        Collections.sort(nums);
        
        boolean foundNonDivisible = false;
        int first = nums.get(0);
        for (int num : nums) {
            if (num % first != 0) {
                foundNonDivisible = true;
                break;
            }
        }
        
        int result = foundNonDivisible ? -1 : first;
        System.out.println(result);
    }
}

