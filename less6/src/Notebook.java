import java.util.Scanner;

public class Notebook {
    String model;
    String manufacturer;
    String price;
    String os;
    String hdd;
    String memory;
    String color;

    public String toString(){
        return model + " " + "(" + manufacturer + ", " + os + ", " + hdd + ", " + memory + ", " + color + ")";
    }

    void setNote(int console, String params){
        String paramsLine = "";
        if(console == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите параметры через запятую (Модель, Производитель, Цена, ОС, HDD, ОЗУ, Цвет): ");
            paramsLine = scanner.nextLine();
        }else{
            paramsLine = params;
        }

        String[] paramsArr = paramsLine.split(",");
        this.model =  paramsArr[0].trim();
        this.manufacturer =  paramsArr[1].trim();
        this.price =  paramsArr[2].trim();
        this.os =  paramsArr[3].trim();
        this.hdd =  paramsArr[4].trim();
        this.memory =  paramsArr[5].trim();
        this.color =  paramsArr[6].trim();
    }
}
