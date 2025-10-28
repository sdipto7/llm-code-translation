import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        
        String[] elemStrings = scanner.nextLine().split(" ");
        List<Integer> elems = new ArrayList<>();
        for (String s : elemStrings) {
            elems.add(Integer.parseInt(s));
        }
        
        boolean allSame = true;
        for (int i = 1; i < elems.size(); i++) {
            if (!elems.get(i).equals(elems.get(0))) {
                allSame = false;
                break;
            }
        }
        
        if (allSame) {
            System.out.println(0);
            return;
        }
        
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        
        boolean suffixAllSame = true;
        for (int i = k; i < elems.size(); i++) {
            if (!elems.get(i).equals(elems.get(k - 1))) {
                suffixAllSame = false;
                break;
            }
        }
        
        if (!suffixAllSame) {
            System.out.println(-1);
            return;
        }
        
        int target = elems.get(elems.size() - 1);
        List<Integer> toDelete = new ArrayList<>(elems.subList(0, k - 1));
        
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == target) {
            toDelete.remove(toDelete.size() - 1);
        }
        
        System.out.println(toDelete.size());
    }
}
