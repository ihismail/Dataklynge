import java.util.LinkedList;

public class Dataklynge {
    LinkedList<Rack> klynge;

    public Dataklynge() {
        klynge = new LinkedList<>();
        Rack forste = new Rack();
        klynge.add(forste);
    }

    public void settIRack(Node n){
        Rack t = klynge.getLast();
        if(t.ledigPlass()) {
            t.settInnNode(n);
        }
        else {
            Rack nyRack = new Rack();
            klynge.add(nyRack);
            nyRack.settInnNode(n);
        }
    }
}