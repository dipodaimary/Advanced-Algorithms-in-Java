package Kosaraju;

public class Edge {
    private double weight;
    private Vertex startingVertex;
    private Vertex targetVertex;

    public Edge(double weight, Vertex startingVertex, Vertex targetVertex) {
        this.weight = weight;
        this.startingVertex = startingVertex;
        this.targetVertex = targetVertex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStartingVertex(Vertex startingVertex) {
        this.startingVertex = startingVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getStartingVertex() {
        return startingVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }
}
