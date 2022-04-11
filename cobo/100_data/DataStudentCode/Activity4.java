import core.data.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Circuits> circuits = new ArrayList<Circuits>();
        Scanner sc = new Scanner(new File("circuits.csv"));
        System.out.println(sc.nextLine());
        while (sc.hasNext()) {
            String thing = sc.nextLine();
            System.out.println(thing);
            String[] things = thing.split(",");
            int o = -1;
            try {
                o = Integer.parseInt(things[7]);
            } catch (Exception e) {
                //TODO: handle exception
                
            }
            circuits.add(new Circuits(things[0], things[1], things[2], things[3], things[4], Double.parseDouble(things[5]), Double.parseDouble(things[6]), o, things[8]));
        }
        sc.close();
        System.out.println(circuits.size());

    }
}