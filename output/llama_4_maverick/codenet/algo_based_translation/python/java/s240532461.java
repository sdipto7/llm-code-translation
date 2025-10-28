
import java.util.Scanner;

public class s240532461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int L = Integer.parseInt(inputs[1]);
        int[] aji = new int[N];
        for (int i = 0; i < N; i++) {
            aji[i] = L + i;
        }
        if (min(aji) >= 0) {
            removeElement(aji, indexOfMin(aji));
        } else if (max(aji) <= 0) {
            removeElement(aji, indexOfMax(aji));
        } else {
            removeElement(aji, indexOfMinAbs(aji));
        }
        System.out.println(sum(aji));
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int indexOfMin(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int indexOfMax(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int indexOfMinAbs(int[] array) {
        int minAbs = Math.abs(array[0]);
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < minAbs) {
                minAbs = Math.abs(array[i]);
                index = i;
            }
        }
        return index;
    }

    private static void removeElement(int[] array, int index) {
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }
        return sum;
    }
}

