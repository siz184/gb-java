import java.util.Scanner;

public class Notebook {
    String model;
    String manufacturer;
    Double price;
    String os;
    Integer hdd;
    Integer memory;
    String color;

    public Notebook(String model, String manufacturer, Double price, String os, Integer hdd, Integer memory, String color){
        this.model = model;
        this.price = price;
        this.manufacturer = manufacturer;
        this.os = os;
        this.hdd = hdd;
        this.memory = memory;
        this.color = color;

    }

    public String getModel(){
        return model;
    }
    public String getOs(){
        return os;
    }
    public Integer getHdd(){
        return hdd;
    }
    public Integer getMemory(){
        return memory;
    }
    public String getColor(){
        return color;
    }


    public String toString(){
        return model + " " + "(" + manufacturer + ", " + price + ", " + os + ", " + hdd + ", " + memory + ", " + color + ")";
    }

}
