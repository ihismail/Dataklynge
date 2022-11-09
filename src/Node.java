public class Node {
    final int prosessorer;
    final int minne;

    public Node(int prosessorer, int minne) {
        this.prosessorer = prosessorer;
        this.minne = minne;
    }

    public int getProsessorer() {
        return prosessorer;
    }

    public boolean storNok(int m) {
        return minne >= m;
    }
}