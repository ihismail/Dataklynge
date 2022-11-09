public class Rack {
    Node[] rack = new Node[12];
    private int antPros;
    private int counter;

    public Rack() {
        counter = 0;
        antPros = 0;
    }

    public void settInnNode(Node n) {
        rack[counter] = n;
        counter++;
        antPros+= n.getProsessorer();
    }

    public boolean ledigPlass() {
        return counter < 12;
    }

    public int getAntPros() {
        return antPros;
    }

    public int minneStortNok(int mm) {
        int antallStoreNok = 0;
        for(int i = 0; i<12; i++) {
            if(rack[i].storNok(mm)) {
                antallStoreNok++;
            }
        }
        return antallStoreNok;
    }
}