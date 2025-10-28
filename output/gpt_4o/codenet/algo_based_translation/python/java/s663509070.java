
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s663509070 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and D
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.nextLine(); // Consume the rest of the line

        // Initialize the list of points
        List<List<Integer>> mat = new ArrayList<>();

        // Read each point
        for (int d = 0; d < N; d++) {
            List<Integer> point = new ArrayList<>();
            for (int dim = 0; dim < D; dim++) {
                point.add(scanner.nextInt());
            }
            mat.add(point);
        }

        // Initialize the counter
        int c = 0;

        // Calculate distances and count integer distances
        for (int i = 0; i < mat.size() - 1; i++) {
            for (int j = i + 1; j < mat.size(); j++) {
                double dist = 0;
                for (int k = 0; k < D; k++) {
                    int x = mat.get(i).get(k);
                    int y = mat.get(j).get(k);
                    dist += Math.pow(x - y, 2);
                }
                dist = Math.sqrt(dist);
                if ((int) dist == dist) {
                    c++;
                }
            }
        }

        // Output the result
        System.out.println(c);
    }
}

