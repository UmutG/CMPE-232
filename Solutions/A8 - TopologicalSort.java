import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    int vertices;
    LinkedList<Integer> adjList[];

    public TopologicalSort(int vert) {
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
        Stack<Integer> list = new Stack<>();
        topSortHelper(df, hasVisited, list);
    }

    public void topSortHelper(int df[], boolean vis[], Stack<Integer> stack) {
        boolean flag = false;
        for (int i = 0; i < vertices; i++) {
            if (df[i] == 0 && vis[i] == false) {
                vis[i] = true;
                stack.add(i);
                for (int adjc: adjList[i]){
                    df[adjc]--;
                }

                topSortHelper(df, vis, stack);

                vis[i] = false;
                stack.remove(stack.size() - 1);
                for (int adjc: adjList[i])
                    df[adjc]--;
            }
            flag = true;
        }

        if (!flag) {
            stack.forEach(i -> System.out.println(i + " "));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TopologicalSort ts = new TopologicalSort(5);
        ts.addEdge(4, 3);
        ts.addEdge(3, 1);
        ts.addEdge(3, 2);
        ts.addEdge(4, 1);
        ts.addEdge(2, 1);
        ts.tSort();
    }
}
