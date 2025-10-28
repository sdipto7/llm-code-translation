
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = reader.lines().collect(Collectors.toList());
        String[] numberStrings = lines.get(1).split(" ");
        List<Integer> a = new ArrayList<>();
        
        for (String numStr : numberStrings) {
            a.add(Integer.parseInt(numStr));
        }
        Collections.sort(a);
        
        int minVal = a.get(0);
        boolean hasRemainder = false;
        
        for (int x : a) {
            if (x % minVal != 0) {
                hasRemainder = true;
                break;
            }
        }
        
        System.out.println(hasRemainder ? -1 : minVal);
    }
}

