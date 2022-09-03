package poo.herencia;
import poo.clases.Coche;
// Clase Hija, Subclase.
public class Hibrido extends Coche {

    String category;

    // Metodo Super.

    // No se puede heredar dos clases con extends.

    public Hibrido(String model,String maker,int year, String category){

        super(model, maker, year);

        this.category = category;
    }
    
}
