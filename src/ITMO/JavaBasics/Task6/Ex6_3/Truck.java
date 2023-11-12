package ITMO.JavaBasics.Task6.Ex6_3;

public class Truck extends Car{
    public int quantityWheels;
    public int maxWeight;

    public Truck(int w, String m, char c, float s,  int maxWeight, int quantityWheels) {
        super(w, m, c, s);
        this.quantityWheels = quantityWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int quantity){
        setQuantityWheels(quantity);
        System.out.println("Новое количество колес - " + getQuantityWheels() + " шт.");
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Максимальный вес - " + maxWeight + " кг. и количество колес - " + quantityWheels + " шт.");
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }
}
