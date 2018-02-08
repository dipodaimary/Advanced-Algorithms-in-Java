package CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> adjacenciesList;

    public Vertex(String name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacenciesList.add(vertex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    @Override
    public String toString() {
        return name;
    }
}
