import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class HovedprogramReader {

    static Dataklynge rocky = new Dataklynge();

    public static void main(String[] args) {

        try {
            File minFil = new File("dataklynge.txt");
            Scanner minLeser = new Scanner(minFil);
            while(minLeser.hasNextLine()) {
                String nextLine = minLeser.nextLine();
                fileReader(nextLine);
            }
        }  catch (FileNotFoundException e) {
            System.out.println("An erorr occured when reading.");
            e.printStackTrace();
        }
    }

    public static void fileReader(String line) {
        //parse data and input into rocky
        String[] data = line.split(" ");
        for (int i = 0; i < Integer.parseInt(data[0]); i++) {
            Node noddy = new Node(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            rocky.settIRack(noddy);
        }
    }
}