
import java.util.*;

public class s964794058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memTime = scanner.nextInt();
        int[] memLate = new int[memTime];
        for (int i = 0; i < memTime; i++) {
            memLate[i] = scanner.nextInt();
        }
        Set<Integer> colorList = new HashSet<>();
        int highLate = 0;
        for (int i = 0; i < memTime; i++) {
            int member = memLate[i];
            int color = member / 400;
            if (color >= 8) {
                highLate++;
            } else {
                colorList.add(color);
            }
        }
        int maxColor = colorList.size() + highLate;
        int minColor = colorList.size() == 0 ? 1 : colorList.size();
        System.out.println(minColor + " " + maxColor);
    }
}

