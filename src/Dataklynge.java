import java.util.LinkedList;

public class Dataklynge {
    LinkedList<Rack> dataklynge;

    public Dataklynge() {
        dataklynge = new LinkedList<>();
        Rack r = new Rack();
        dataklynge.add(r);
    }

    public void settIRack(Node n){
        Rack t = dataklynge.getLast();
        if(t.settInnNode(n)) {
            r = new Rack();
            dataklynge.add(r);
            r.settIRack(n);
        }
        else
}