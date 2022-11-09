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

    //Lag en metode antProsessorer i Dataklynge som returnerer det totale
    //antall prosessorer i dataklyngen
    public int antProsessorer(){
        int ant = 0;
        for(Rack racket: klynge) {
            ant+= racket.getAntPros();
        }
        return ant;
    }

    public int noderMedNokMinne(int paakrevdMinne){
        int teller = 0;
        for(Rack racket: klynge) {
            teller += racket.minneStortNok(paakrevdMinne);
        }
        return teller;
    }
}