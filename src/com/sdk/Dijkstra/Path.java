package com.sdk.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private List<Node> nodesPath;
    private int distance;

    public Path() {
        nodesPath = new ArrayList<>();
        this.distance = 0;
    }

    public List<Node> getNodesPath() {
        return nodesPath;
    }

    public void setNodesPath(List<Node> nodesPath) {
        this.nodesPath = nodesPath;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
