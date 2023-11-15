package ITMO.JavaBasics.Task9.Ex9_3;


import java.util.*;

public class Elements {

    public List createArrayList(int size) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size;i++)
        {
            arrayList.add((int) (0 + 1000000 * Math.random()));
        }
        return arrayList;
    }
    public List createLinkedList(int size) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size;i++)
        {
            linkedList.add((int) (1 + 1000000 * Math.random()));
        }
        return linkedList;
    }

    public List createList(int size, String name) {
        if (Objects.equals(name, "arrayList")){
            return createArrayList(size);
        }
        else {
            return createLinkedList(size);
        }
    }
    public void selectElement(int quantity, List<?> list) {
       for (int i = 1; i<= quantity;i++)
       {
           list.get((int) (0 + 999999 * Math.random()));
       }

    }
}
