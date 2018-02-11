package Kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int id;
    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;
    private int componentId;

    public Vertex(int id, String name) {
        this.id = id;
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public int getComponentId() {
        return componentId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
