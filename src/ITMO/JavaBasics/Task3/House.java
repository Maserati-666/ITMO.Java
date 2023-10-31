package ITMO.JavaBasics.Task3;

public class House {
    private int numberFloor;
    private int yearBuild;
    private String designation;

    public House() {
    }

    public void HouseInput(int numberFloor, int yearBuild, String designation) {
         this.numberFloor = numberFloor;
         this.yearBuild = yearBuild;
         this.designation = designation;
    }
    public String HouseOutput() {
        return  "NumberFloor = " + numberFloor + " ," +
                "YearBuild = " + yearBuild + " ," +
                "Designation = " + designation;
    }
    public String HouseAge() {
        int houseAge = 2023 - yearBuild;
        return  "HouseAge = " + houseAge;
    }

}

class Program {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.HouseInput(5,1996,"Пятиэтажный дом");
        house2.HouseInput(10,2013,"Десятиэтажный дом");
        System.out.println(house1.HouseOutput());
        System.out.println(house1.HouseAge());
        System.out.println(house2.HouseOutput());
        System.out.println(house2.HouseAge());

    }
}
