
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().trim().split("\\s+");
        ArrayList<Integer> parityList = new ArrayList<>();
        
        for (String part : parts) {
            int num = Integer.parseInt(part);
            parityList.add(num % 2);
        }
        
        int sumParity = 0;
        for (int p : parityList) {
            sumParity += p;
        }
        
        int target = sumParity == 1 ? 1 : 0;
        int resultIndex = -1;
        
        for (int i = 0; i < parityList.size(); i++) {
            if (parityList.get(i) == target) {
                resultIndex = i;
                break;
            }
        }
        
        System.out.println(resultIndex + 1);
    }
}

