package ClassNotes.April8AdjListGraph;

public class Edge extends HW8.Edge {

    public String startNode;
    public String endNode;
    public int weight;

    public Edge(String startNode, String endNode, int weight) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
    }
}
