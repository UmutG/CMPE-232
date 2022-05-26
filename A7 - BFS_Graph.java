import java.util.LinkedList;

public class BFS_Graph {
    private int vertices;
    private LinkedList<Integer> adjacency[];
    LinkedList<String> color[];
    LinkedList<Integer> d [];
    LinkedList<Integer> precessor [];

    BFS_Graph(int vertice){
        vertices = vertice;
        adjacency = new LinkedList[vertice];
        color = new LinkedList[vertice];
        d = new LinkedList[vertice];
        precessor = new LinkedList[vertice];

        for (int i = 0; i < vertice; i++)
            adjacency[i] = new LinkedList();
    }

    void edge(int from, int to){
        adjacency[from].add(to);
    }

    void BFS(BFS_Graph G, int s){
        int size = G.adjacency[s].size();

        for (int i = 0; i < size; i++){
            if (G.adjacency[i] != G.adjacency[s]){
                G.color[i].set(i, "WHITE");
                G.d[i].set(i, -1);
                G.precessor[i].set(i, null);
            }
        }

        G.color[s].set(s, "GRAY");
        G.d[s].set(s, 0);
        G.precessor[s].set(s, 0);

    }

    public static void main(String[] args) {

    }
}
