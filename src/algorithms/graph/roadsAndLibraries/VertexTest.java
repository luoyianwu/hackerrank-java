package algorithms.graph.roadsAndLibraries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VertexTest {

    @Test
    void canBeCreatedWithValue() {
        int s = 1;
        Vertex v = new Vertex(s);
        assertEquals(s, v.getName());
    }

    @Test
    void canAddNeighbors() {
        int vName = 1;
        int wName = 2;
        int yName = 3;
        Vertex v = new Vertex(vName);
        Vertex w = new Vertex(wName);
        Vertex y = new Vertex(yName);

        v.addNeighbor(w);
        v.addNeighbor(y);
        assertTrue(v.getNeighbors().contains(w));
        assertTrue(v.getNeighbors().contains(y));
        assertFalse(v.getNeighbors().contains(new Vertex(4)));
    }
}