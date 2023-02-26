import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class laptop {
    int ID;
    String manufacturer;
    String model;
    int RAM;
    int HD;
    String OS;
    int price;

    public String toString(int ID) {
        return model;
    }

    public laptop(
        int ID,
        String manufacturer,
        String model,
        int RAM,
        int HD,
        String OS,
        int price) {
            this.ID = ID;
            this.manufacturer = manufacturer;
            this.model = model;
            this.RAM = RAM;
            this.HD = HD;
            this.OS = OS;
            this.price = price;
    }

    public String printLaptop(){
        return "ID: " + ID + ", manufacturer: " + manufacturer + ", model: " + model + ", RAM: " + RAM + ", HD: " + HD + ", OS: " + OS + ", price: " + price;
    }

    public  List <laptop> findLaptop(HashSet<laptop> hashLaptop, String manufacturer){
        List <laptop> laptopList = new ArrayList <laptop>();
        for (laptop laptop : hashLaptop) {
            if(laptop.manufacturer.equals(manufacturer)) {
                laptopList.add(laptop);
            }
        }
        return laptopList;
    }
}
