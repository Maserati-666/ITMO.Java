package ITMO.JavaBasics.Task9.Ex9_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(55);
        integers.add(12);
        integers.add(7);
        integers.add(7);
        integers.add(55);
        integers.add(578);
        List<String> integ = new LinkedList<>();
        integ.add("550");
        integ.add("120");
        integ.add("70");
        integ.add("70");
        integ.add("550");
        integ.add("5780");
        NoDubles thing = new NoDubles();
        System.out.println(thing.clearDubles(integers));
        System.out.println(thing.clearDubles(integ));
    }
}
