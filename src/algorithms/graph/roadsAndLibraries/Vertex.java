package algorithms.graph.roadsAndLibraries;

import java.util.HashSet;

public class Vertex {
    private final int name;
    private final HashSet<Vertex> neighbors = new HashSet<>();

    public Vertex(int value) {
       this.name = value;
    }

    public int getName() {
        return name;
    }

    public void addNeighbor(Vertex y) {
        this.neighbors.add(y);
    }

    public HashSet<Vertex> getNeighbors() {
        return this.neighbors;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" - ");
        for (Vertex neighbor : neighbors) {
            sb.append(neighbor.getName());
            sb.append(" ");
        }
        return sb.toString();
    }
}