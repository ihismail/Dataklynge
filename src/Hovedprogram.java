public class Hovedprogram {
    public static void main(String[] args) {
        Dataklynge saga = new Dataklynge();
        for(int i = 0; i<450; i++) {
            Node noddy = new Node(4, 512);
            saga.settIRack(noddy);
        }
        for(int i = 0; i<16; i++) {
            Node node = new Node(8, 1024);
            saga.settIRack(node);
        }
        int ant128GB = saga.noderMedNokMinne(128);
        int ant512GB = saga.noderMedNokMinne(512);
        int ant1024GB = saga.noderMedNokMinne(1024);
        int antPros = saga.antProsessorer();

        System.out.println("Noder med minst 128 GB: " + ant128GB);
        System.out.println("Noder med minst 512 GB: " + ant512GB);
        System.out.println("Noder med minst 1024 GB: " + ant1024GB);

        System.out.println("Antall prosessorer: " + antPros);
        System.out.println("Antall rack: " + saga.klynge.size());
    }
}