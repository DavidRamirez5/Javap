package poo.ejercicio;

public class SmartDevice {
    
    String trademark;
    String model;
    String color;
    double price;


    public SmartDevice(){
    }

    public SmartDevice( String trademark, String model, String color, double price){
        this.trademark = trademark;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String turnOn(){
        return "El dispositivo " + this.model + " esta Encendido";
    }

    public String turnOff(){
        return "El dispositivo " + this.model + " esta Apagado";
    }

}
