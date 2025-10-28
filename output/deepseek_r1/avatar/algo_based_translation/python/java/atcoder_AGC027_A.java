
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> firstLine = readInts(scanner);
        int n = firstLine.get(0);
        int x = firstLine.get(1);
        
        List<Integer> a = readInts(scanner);
        Collections.sort(a);
        
        if (a.get(0) > x) {
            System.out.println(0);
            return;
        }
        
        int ans = 0;
        for (int num : a) {
            if (num > x) {
                x = 0;
                break;
            }
            x -= num;
            ans++;
        }
        
        if (x != 0) {
            ans--;
        }
        
        System.out.println(ans);
    }
    
    private static List<Integer> readInts(Scanner scanner) {
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) {
            return new ArrayList<>();
        }
        String[] tokens = line.split("\\s+");
        List<Integer> list = new ArrayList<>();
        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }
        return list;
    }
}

