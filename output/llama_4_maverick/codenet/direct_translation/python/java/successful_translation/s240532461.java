
import java.util.Scanner;

public class s240532461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] aji = new int[N];
        for (int i = 0; i < N; i++) {
            aji[i] = L + i;
        }
        int index;
        if (aji[0] >= 0) {
            index = findMinIndex(aji);
        } else if (aji[N - 1] <= 0) {
            index = findMaxIndex(aji);
        } else {
            index = findMinAbsIndex(aji);
        }
        int sum = sumArray(aji, index);
        System.out.println(sum);
    }

    private static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int findMinAbsIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(array[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int sumArray(int[] array, int excludeIndex) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != excludeIndex) {
                sum += array[i];
            }
        }
        return sum;
    }
}

