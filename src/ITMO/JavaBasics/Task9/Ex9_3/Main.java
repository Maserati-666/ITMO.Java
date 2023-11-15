package ITMO.JavaBasics.Task9.Ex9_3;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elements arrlist = new Elements();
        List list1 = arrlist.createList(1000000, "arrayList");
        List list2 = arrlist.createList(1000000, "linkedList");
        long t1 = System.currentTimeMillis();
        arrlist.selectElement(100000,list1);
        long t2 = System.currentTimeMillis();
        arrlist.selectElement(100000,list2);
        long t3 = System.currentTimeMillis();
        System.out.println("Процедура выбора из arrayList заняла: " + (t2 - t1) + " миллисекунд");
        System.out.println("Процедура выбора из linkedList заняла: " + (t3 - t2) + " миллисекунд");
    }
}
