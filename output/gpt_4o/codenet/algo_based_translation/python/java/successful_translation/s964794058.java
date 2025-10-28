
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class s964794058 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memTime = Integer.parseInt(scanner.nextLine());
        String[] memLateStrings = scanner.nextLine().split(" ");
        List<Integer> memLate = new ArrayList<>();
        for (String s : memLateStrings) {
            memLate.add(Integer.parseInt(s));
        }
        
        int[] result = calculateColorRange(memTime, memLate);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] calculateColorRange(int memTime, List<Integer> memLate) {
        Set<Integer> colorList = new HashSet<>();
        int highLate = 0;

        for (int color = 0; color < memTime; color++) {
            int member = memLate.get(color);
            if (member / 400 >= 8) {
                highLate++;
            } else {
                colorList.add(member / 400);
            }
        }

        int maxColor = colorList.size() + highLate;
        int minColor = colorList.size();
        if (minColor == 0) {
            minColor = 1;
        }

        return new int[]{minColor, maxColor};
    }
}

