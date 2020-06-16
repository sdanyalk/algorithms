package com.sdk.TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DFSToplogicalSort dfsToplogicalSort = new DFSToplogicalSort();
        List<Node> graph = new ArrayList<>();

        graph.add(new Node(0));
        graph.add(new Node(1));
        graph.add(new Node(2));
        graph.add(new Node(3));
        graph.add(new Node(4));
        graph.add(new Node(5));

        graph.get(2).addNeighbor(graph.get(3));
        graph.get(4).addNeighbor(graph.get(1));
        graph.get(4).addNeighbor(graph.get(0));
        graph.get(5).addNeighbor(graph.get(0));
        graph.get(5).addNeighbor(graph.get(2));

        dfsToplogicalSort.topologicalSort(graph);

        for (int i = 0; i < graph.size(); i++) {
            System.out.print(dfsToplogicalSort.getStack().pop());
        }
        System.out.print("end");
    }
}
