
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().trim().split("\\s+");
        ArrayList<Integer> A = new ArrayList<>();
        for (String s : input) {
            A.add(Integer.parseInt(s));
        }
        
        int mn = N + 1;
        int mx = -1;
        for (int i = 0; i < N; i++) {
            if (A.get(i) != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        
        if (mx == -1) {
            System.out.println("0 0");
            return;
        }
        
        ArrayList<Integer> modifiedA = new ArrayList<>();
        modifiedA.addAll(A.subList(0, mn));
        ArrayList<Integer> reversedPart = new ArrayList<>(A.subList(mn, mx + 1));
        Collections.reverse(reversedPart);
        modifiedA.addAll(reversedPart);
        modifiedA.addAll(A.subList(mx + 1, A.size()));
        
        if (isSorted(modifiedA)) {
            System.out.println((mn + 1) + " " + (mx + 1));
        } else {
            System.out.println("0 0");
        }
    }
    
    private static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

