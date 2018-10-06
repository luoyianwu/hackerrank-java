package algorithms.graph.roadsAndLibraries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void canBeCreated() {
        Graph g = new Graph();
        g.addVertex(new Vertex(1));
        assertEquals(1, g.getVertices().size());
    }

    @Test
    void canAddEdge() {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        assertEquals(3, g.getVertices().size());
        assertEquals(2, g.getVertex(2).getNeighbors().size());
        assertEquals(1, g.getVertex(1).getNeighbors().size());
    }
}