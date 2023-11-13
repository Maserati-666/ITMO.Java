package ITMO.JavaBasics.Task7;

public class Plane {
    class Wing {
        private int wingWeight;

        public Wing(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        public int Output() {
            return wingWeight;
        }
    }

    public int inputWeight(int weight) {
        Plane.Wing wind = new Plane.Wing(weight);
        return wind.Output();
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        System.out.println("Вес крыла: " + plane1.inputWeight(3000) + " кг");
        Plane plane2 = new Plane();
        System.out.println("Вес крыла: " + plane2.inputWeight(2000) + " кг");
        Plane plane3 = new Plane();
        System.out.println("Вес крыла: " + plane3.inputWeight(4000) + " кг");
    }
}
