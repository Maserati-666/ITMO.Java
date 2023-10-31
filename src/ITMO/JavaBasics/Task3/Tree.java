package ITMO.JavaBasics.Task3;

public class Tree {
    private int age;
    private Boolean isAlive;
    private String designation;

    public Tree(int age, String designation) {
        this.age = age;
        this.designation = designation;
    }
    public Tree(int age, boolean isAlive, String designation) {
        this.age = age;
        this.isAlive = isAlive;
        this.designation = designation;
    }
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", designation='" + designation + '\'' +
                '}';
    }
}

class Programm {
    public static void main(String[] args) {
        Tree tree1 = new Tree(15, "Клён");
        Tree tree2 = new Tree(40, true, "Дуб");
        Tree tree3 = new Tree();
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}