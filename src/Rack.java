public class Rack {
    Node[] rack = new Node[12];
    int counter;

    public Rack() {
        counter = 0;
    }

    //Et Rack-objekt skal bl.a. inneholde en metode
    //som legger til en ny node i racket hvis det er færre enn maks antall
    //noder der fra før
    public boolean settInnNode(Node n) {
        if(rack[counter]==null) {
            return true;
        }
        else {
            rack[counter] = n;
            counter++;
            return false;
        }
    }
}