
import java.util.Arrays;
import java.util.Scanner;

public class s430322735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String[] lst = new String[n];
        for (int i = 0; i < n; i++) {
            String st = sortString(scanner.nextLine());
            lst[i] = st;
        }
        Arrays.sort(lst);
        int cnt = countAnagramPairs(lst);
        System.out.println(cnt);
    }

    private static String sortString(String input) {
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    private static int countAnagramPairs(String[] lst) {
        String[] list = Arrays.copyOf(lst, lst.length + 1);
        list[list.length - 1] = "end";
        String pre = "";
        int tmpCnt = 0;
        int cnt = 0;
        for (String i : list) {
            if (i.equals(pre)) {
                tmpCnt += 1;
            } else {
                cnt += (tmpCnt * (tmpCnt + 1)) / 2;
                tmpCnt = 1;
            }
            pre = i;
        }
        return cnt;
    }
}

