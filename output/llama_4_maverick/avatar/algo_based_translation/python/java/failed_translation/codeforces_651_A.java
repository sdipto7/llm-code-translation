
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        System.out.println(Math.max(x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }

    public static int numInp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] arrInp() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        return arr;
    }

    public static int[] spInp() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        return arr;
    }

    public static String strInp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

