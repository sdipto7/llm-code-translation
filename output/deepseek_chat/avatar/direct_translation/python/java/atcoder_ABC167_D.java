
import java.util.*;
import java.io.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> L = new ArrayList<>();
        L.add(-1);
        for (int i = 0; i < N; i++) {
            L.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> path = new ArrayList<>();
        path.add(1);
        int idx = 0;
        int x = 1;
        boolean flag = false;
        HashMap<Integer, Integer> hash = new HashMap<>();
        int t = -1;
        for (int i = 0; i <= N; i++) {
            int ne = L.get(x);
            if (hash.containsKey(ne)) {
                flag = true;
                t = hash.get(ne);
                break;
            }
            path.add(ne);
            idx++;
            hash.put(ne, idx);
            x = ne;
        }
        if (flag) {
            ArrayList<Integer> loop = new ArrayList<>(path.subList(t, path.size()));
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K -= path.size();
                K %= loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}

