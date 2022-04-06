import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        ArrayList<Circuits> circuits = new ArrayList<Circuits>();
        Scanner sc = new Scanner("circuits.csv");
        sc.nextLine();
        while (sc.hasNext()) {
            String thing = sc.nextLine();
            String[] things = thing.split(",");
            circuits.add(new Circuits(things[0], things[1], things[2], things[3], things[4], things[5], things[6], things[7], things[8]))
        }

    }
}