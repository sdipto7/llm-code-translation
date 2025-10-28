
import java.util.Scanner;

public class s454986054 {
    public static int readInput(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int calculateCube(int n) {
        return (int) Math.pow(n, 3);
    }

    public static void printOutput(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readInput(scanner);
        int cubeN = calculateCube(n);
        printOutput(cubeN);
        scanner.close();
    }
}

