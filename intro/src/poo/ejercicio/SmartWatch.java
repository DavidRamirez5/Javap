package poo.ejercicio;
import java.util.Date;

public class SmartWatch extends SmartDevice{
    
    String colorBand;

    public SmartWatch(String trademark,String model,String color,double price, String colorBand){
        super(trademark, model, color, price);
        this.colorBand = colorBand;
    }

    public  void getDate(){
        Date date = new Date();
        System.out.println(date);
    }

}
