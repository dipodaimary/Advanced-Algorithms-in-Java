package TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public String getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    @Override
    public String toString() {
        return this.data;
    }
}
