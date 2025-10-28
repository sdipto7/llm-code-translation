
import java.lang.Math;
import java.util.Scanner;

public class s538657784 {
  public static void func(int N) {
    int sqN = (int) Math.sqrt(N);
    for (int i = 0; i < sqN; i++) {
      if (N % (sqN - i) == 0) {
        int result = (N / (sqN - i) + sqN - i) - 2;
        System.out.println(result);
        break;
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();
    func(N);
  }
}

