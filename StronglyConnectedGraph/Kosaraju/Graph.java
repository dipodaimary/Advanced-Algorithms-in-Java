package Kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertexList;
    private List<Edge> edgeList;

    public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    public Graph() {

    }

    public Graph getTransposeGraph() {
        Graph transposeGraph = new Graph();
        List<Vertex> transposeVertesList = new ArrayList<>();
        List<Edge> transposeEdgeList = new ArrayList<>();
        for (Vertex v : this.vertexList) {
            transposeVertesList.add(v);
        }
        for (Edge e : this.edgeList) {
            transposeVertesList.get(transposeVertesList.indexOf(e.getTargetVertex())).addNeighbour(e.getStartingVertex());
        }
        transposeGraph.setVertexList(vertexList);
        //transposeGraph.setEdgeList(transposeEdgeList);
        return transposeGraph;
    }

    public void setVertexList(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }
}
