import java.util.LinkedList;
import java.util.Queue;

public class BFS_Graph {
	int vertex;
	
    class Node{
    	String color;
    	int d, precessor;
    	Node next;
    }
    
    LinkedList <BFS_Graph.Node> Adj[];
    
    void BFS(BFS_Graph G, Node s) {
    	for (LinkedList<BFS_Graph.Node> u: G.Adj) {
    		if (!s.equals(u))
    		u.color = "WHITE";
    		u.d = -1;
    		u.precessor = (Integer) null;
    	}
    	s.color = "GRAY";
    	s.d = 0;
    	s.precessor = (Integer) null;
    	
    	Queue <BFS_Graph.Node> queue = null;
    	queue.add(s);
    	
    	while (!queue.isEmpty()) {
    		BFS_Graph.Node u = queue.poll();
    		for (Node v: G.Adj[u]) {
    			
    		}
    	}
    }

    public static void main(String[] args) {
    	BFS_Graph bfsg = new BFS_Graph(5);
    	bfsg.addEdge(0, 1);
    	bfsg.addEdge(2, 1);
    	bfsg.addEdge(3, 1);
    	bfsg.addEdge(1, 2);
    	bfsg.addEdge(1, 4);
    	bfsg.addEdge(4, 3);
    	bfsg.addEdge(3, 2);
    	bfsg.addEdge(2, 3);
    	bfsg.printGraph(bfsg);
    }
}
