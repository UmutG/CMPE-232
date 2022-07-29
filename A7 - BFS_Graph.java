import java.util.LinkedList;
import java.util.Queue;

public class BFS_Graph {
    class Node{
        String color;
        int d, precessor;
        Node next;
    }

    Node node;
    LinkedList <Node> Adj[];

    void addEdge(int v, Node n){
        Adj[v].add(n);
    }

    void BFS(BFS_Graph G, Node s) {
        int i = 0;
        for (Node u: G.Adj[i]) {
            if (u != s){
                u.color = "WHITE";
                u.d = -1;
                u.precessor = (Integer) null;
            }
            i++;
        }
        s.color = "GRAY";
        s.d = 0;
        s.precessor = (Integer) null;

        Queue <Node> queue = null;
        queue.add(s);

        while (!queue.isEmpty()) {
            Node u = queue.poll();
            int nu = u.next.precessor;

            for (Node v: G.Adj[nu]){
                if(v.color == "WHITE"){
                    v.color = "GRAY";
                    v.d = u.d + 1;
                    v.precessor = nu;
                    queue.add(v);
                }
            }
            u.color = "BLACK";
        }
    }

    public static void main(String[] args) {
        BFS_Graph bfsg = new BFS_Graph();
        Node [] nodes = new Node[5];

        bfsg.addEdge(0, nodes[1]);
        bfsg.addEdge(2, nodes[1]);
        bfsg.addEdge(3, nodes[1]);
        bfsg.addEdge(1, nodes[2]);
        bfsg.addEdge(1, nodes[4]);
        bfsg.addEdge(4, nodes[3]);
        bfsg.addEdge(3, nodes[2]);
        bfsg.addEdge(2, nodes[3]);

    }
}
