
import java.util.*;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int z = Integer.parseInt(input[2]);
        int k = Integer.parseInt(input[3]);
        
        List<Integer> a = readList(scanner);
        List<Integer> b = readList(scanner);
        List<Integer> c = readList(scanner);
        
        List<Integer> ab = new ArrayList<>();
        for (int ai : a) {
            for (int bj : b) {
                ab.add(ai + bj);
            }
        }
        ab.sort(Collections.reverseOrder());
        ab = ab.subList(0, Math.min(k, ab.size()));
        
        List<Integer> abc = new ArrayList<>();
        for (int abVal : ab) {
            for (int cVal : c) {
                abc.add(abVal + cVal);
            }
        }
        abc.sort(Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
        
        scanner.close();
    }
    
    private static List<Integer> readList(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        String[] tokens = scanner.nextLine().split(" ");
        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }
        return list;
    }
}

