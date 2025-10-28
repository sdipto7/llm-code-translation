import java.util.*;
import java.util.stream.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;

public class s749244504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        
        int[][] C = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                C[i][j] = scanner.nextInt();
            }
        }
        
        int[][] A = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        Graph<Integer, DefaultEdge> graph = new DefaultDirectedWeightedGraph<>(DefaultEdge.class);
        for (int i = 0; i < 10; i++) {
            graph.addVertex(i);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (graph.containsEdge(i, j)) {
                    graph.setEdgeWeight(graph.getEdge(i, j), C[i][j]);
                } else {
                    DefaultEdge edge = graph.addEdge(i, j);
                    graph.setEdgeWeight(edge, C[i][j]);
                }
            }
        }
        
        Map<Integer, Double> d = new HashMap<>();
        DijkstraShortestPath<Integer, DefaultEdge> dijkstra = new DijkstraShortestPath<>(graph);
        for (int i = 0; i < 10; i++) {
            if (i == 1) continue;
            double pathLength = dijkstra.getPathWeight(i, 1);
            d.put(i, pathLength);
        }
        
        int s = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = A[i][j];
                if (a == -1 || a == 1) continue;
                s += d.get(a);
            }
        }
        
        System.out.println(s);
    }
}
