
import java.util.*;
import java.io.*;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;

public class s749244504 {
    public static void main(String[] args) throws IOException {
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
        
        DefaultDirectedWeightedGraph<Integer, DefaultWeightedEdge> G = 
            new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);
        
        for (int i = 0; i < 10; i++) {
            G.addVertex(i);
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                DefaultWeightedEdge edge = G.addEdge(i, j);
                G.setEdgeWeight(edge, C[i][j]);
            }
        }
        
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i == 1) continue;
            DijkstraShortestPath<Integer, DefaultWeightedEdge> dijkstra = 
                new DijkstraShortestPath<>(G);
            d.put(i, (int) dijkstra.getPathWeight(i, 1));
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


