
import java.util.Scanner;
import java.util.HashSet;

public class s964794058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memTime = Integer.parseInt(scanner.nextLine());
        String[] memLateStr = scanner.nextLine().split(" ");
        int[] memLate = new int[memLateStr.length];
        for (int i = 0; i < memLateStr.length; i++) {
            memLate[i] = Integer.parseInt(memLateStr[i]);
        }
        HashSet<Integer> colorSet = new HashSet<>();
        int highLate = 0;
        for (int i = 0; i < memTime; i++) {
            int member = memLate[i];
            if (member / 400 >= 8) {
                highLate++;
            } else {
                colorSet.add(member / 400);
            }
        }
        int maxColor = colorSet.size() + highLate;
        int minColor = colorSet.size();
        if (minColor == 0) {
            minColor = 1;
        }
        System.out.println(minColor + " " + maxColor);
    }
}

