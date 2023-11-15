package ITMO.JavaBasics.Task9.Ex9_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dict dict = new Dict();
        Map<User, Integer> map = dict.createMap();
        dict.outputScores(map);
    }
}
