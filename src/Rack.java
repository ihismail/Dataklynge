public class Rack {
    Node[] rack = new Node[12];
    int counter;

    public Rack() {
        counter = 0;
    }

    public void settInnNode(Node n) {
        rack[counter] = n;
        counter++;
    }

    public boolean ledigPlass() {
        return counter < 12;
    }
}