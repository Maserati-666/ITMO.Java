package ITMO.JavaBasics.Task9.Ex9_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class Dict {
    public Map<User, Integer> createMap()
    {
        Map<User, Integer> map = new HashMap<>();
        User user1 = new User();
        user1.setName("John");
        User user2 = new User();
        user2.setName("Luc");
        User user3 = new User();
        user3.setName("Lina");
        User user4 = new User();
        user4.setName("Tom");
        User user5 = new User();
        user5.setName("Hank");
        User user6 = new User();
        user6.setName("Don");
        map.put(user1, 45254);
        map.put(user2, 3500);
        map.put(user3, 8741);
        map.put(user4, 85695);
        map.put(user5, 7584);
        map.put(user6, 96541);
        return map;
    }
    public void outputScores(Map<User, Integer> map) {
        System.out.println("Введите имя: ");
        Scanner scaner = new Scanner(System.in);
        String str = scaner.next();
        Integer scores = null;
        for (Map.Entry<User, Integer> user : map.entrySet()) {
            if (Objects.equals(str, user.getKey().getName())) {
                scores = user.getValue();
                break;
            }
        }
        if (scores == null){
            System.out.println("Данного пользователя нет в словаре");
        }
        else {
            System.out.println("Пользователь с именем " + str + " имеет " + scores + " очков");
        }
    }
}
