package poo.ejercicio;

public class SmartPhone extends SmartDevice{
    boolean tripleCamara;

    public SmartPhone(String trademark,String model,String color,double price, boolean tripleCamara){
        super(trademark, model, color, price);
        this.tripleCamara = tripleCamara;
    }
    public void call(String contact ){
        System.out.println("Llamando a " + contact);
    }
}
