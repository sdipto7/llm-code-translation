
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s733189960 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    Map<String, Integer> sdic = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char[] s = scanner.nextLine().toCharArray();
      java.util.Arrays.sort(s);
      String sortedStr = new String(s);
      sdic.put(sortedStr, sdic.getOrDefault(sortedStr, 0) + 1);
    }
    long ans = 0;
    for (int v : sdic.values()) {
      ans += (long)v * (v - 1) / 2;
    }
    System.out.println(ans);
  }
}

