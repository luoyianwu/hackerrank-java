package algorithms.graph.roadsAndLibraries;

import java.util.HashMap;

public class Graph {
    private final HashMap<Integer, Vertex> vertices = new HashMap<>();

    public void addVertex(Vertex v) {
        this.vertices.put(v.getName(), v);
    }

    public HashMap<Integer, Vertex> getVertices() {
        return this.vertices;
    }

    public void addEdge(Integer s1, Integer s2) {
        if (!this.vertices.containsKey(s1)) {
            this.vertices.put(s1, new Vertex(s1));
        }
        if (!this.vertices.containsKey(s2)) {
            this.vertices.put(s2, new Vertex(s2));
        }
        this.vertices.get(s1).addNeighbor(this.vertices.get(s2));
        this.vertices.get(s2).addNeighbor(this.vertices.get(s1));
    }

    public Vertex getVertex(Integer s) {
        return this.vertices.get(s);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vertex v : this.vertices.values()) {
            sb.append(v.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}