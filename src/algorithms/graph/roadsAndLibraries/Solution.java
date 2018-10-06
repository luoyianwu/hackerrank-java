package algorithms.graph.roadsAndLibraries;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    // Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        Graph g = initializeGraph(n, cities);

        HashSet<Integer> visited = new HashSet<>();
        long res = dfs(c_lib, c_road, g, visited);

        return Math.min(res, (long)c_lib * n);
    }

    private static Graph initializeGraph(int n, int[][] cities) {
        Graph g = new Graph();
        addVerticesToGraph(n, g);
        addEdgesToGraph(cities, g);
        return g;
    }

    private static long dfs(int c_lib, int c_road, Graph g, HashSet<Integer> visited) {
        long res = 0;
        for (Vertex v : g.getVertices().values()) {
            Stack<Vertex> s = new Stack<>();
            s.push(v);
            if (visited.contains(v.getName()))
                continue;
            res += c_lib;
            while (!s.isEmpty()) {
                Vertex top = s.pop();
                if (visited.contains(top.getName()))
                    continue;
                res += c_road;
                visited.add(top.getName());
                for (Vertex neighbor: top.getNeighbors()) {
                    s.push(neighbor);
                }
            }
            res -= c_road;
        }
        return res;
    }

    private static void addEdgesToGraph(int[][] cities, Graph g) {
        for (int[] edge : cities) {
            g.addEdge(edge[0], edge[1]);
        }
    }

    private static void addVerticesToGraph(int n, Graph g) {
        for (int i = 1; i <= n; i++) {
            g.addVertex(new Vertex(i));
        }
    }


    public static void main(String[] args) throws IOException {
        File f = new File("/home/bob/hackerrank-java/src/algorithms/graph/roadsAndLibraries/input03.txt");
        final Scanner scanner = new Scanner(f);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(String.valueOf(result));
        }

        scanner.close();
    }
}
