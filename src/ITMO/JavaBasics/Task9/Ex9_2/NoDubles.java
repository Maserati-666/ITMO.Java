package ITMO.JavaBasics.Task9.Ex9_2;

import java.util.*;

public class NoDubles {
    public <T> List clearDubles(List<T> collection) {
        if (collection instanceof ArrayList) {
            return new ArrayList<>(new LinkedHashSet<>(collection));
        } else {
            return new LinkedList<>(new LinkedHashSet<>(collection));
        }
    }
}
