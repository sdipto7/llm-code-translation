
import java.util.Scanner;
import java.util.ArrayList;

public class s797394058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        ArrayList<Integer> NList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            NList.add(i);
        }
        
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        for (int a : NList) {
            for (int b : NList) {
                for (int c : NList) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(a);
                    triplet.add(b);
                    triplet.add(c);
                    n.add(triplet);
                }
            }
        }
        
        int m = n.size();
        System.out.println(m);
    }
}

