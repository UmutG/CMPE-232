import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
	int vertices;
	LinkedList<Integer> adjList[];
	
	public TopologicalSort(int vert) {
		// TODO Auto-generated constructor stub
		vertices = vert;
		adjList = new LinkedList[vert];
		
		for (int i = 0; i < vert; i++)
			adjList[i] = new LinkedList();
		
	}
	
	public void addEdge(int vert, int node) {
		adjList[vert].add(node);
	}
	
	public void tSort() {
		boolean hasVisited[] = new boolean[vertices];
		int df [] = new int[vertices];
		for (int i = 0; i < vertices; i++) {
			for (int v: adjList[i])
				df[v] = df[v] + 1;
		}
	}
	
	public void topSortHelper(int df[], boolean vis[], Stack<Integer> stack) {
		int flag = 0;
		for (int i = 0; i < vertices; i++) {
			if (df[i] == 0 && vis[i] == false) {
				vis[i] = true;
				stack.add(i);
			}
		}
		
		if (flag == 0) {
			
		}
	}
	
	public static void main(String[] args) {
		TopologicalSort ts = new TopologicalSort(5);
		ts.addEdge(1, 2);
		ts.addEdge(1, 4);
		ts.addEdge(2, 6);
		ts.addEdge(0, 0);
	}
}
