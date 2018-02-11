package Kosaraju;

import java.util.Stack;

public class DepthFirstOrderClass {
    private Stack<Vertex> stack;

    public DepthFirstOrderClass(Graph graph) {
        stack = new Stack<>();
        for (Vertex vertex : graph.getVertexList()) {
            if (!vertex.isVisited()) {
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex) {
        vertex.setVisited(true);
        for (Vertex v : vertex.getAdjacencyList()) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    public Stack<Vertex> getReversePost() {
        return this.stack;
    }
}
