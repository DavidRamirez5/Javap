package poo.clases;

public class Coche{
    // "Plantilla de Coches"
    
    // Atributos.

    String model;
    String maker;
    // Tipos de datos envolotrios -> Perminten valores null
    int year;
    int speed;
    Motor motor;
    // Consturctores
    // Los constructores son publicos, Resive el mismo nombre que la clase
    public Coche(){} // Constructor sin propiedades -> Vacio
    

    public Coche(String model, String maker, int year){
        this.model = model;
        this.maker = maker;
        this.year = year;
        this.speed = 0;
    }
    // Sobrecarga 
    // Tambien pude incluir clases.
    public Coche(String model, String maker, int year,Motor motor){
            this.model = model;
            this.maker = maker;
            this.year = year;
            this.speed = 0;
            this.motor = motor;
    }


    //Metodos

    public void acelerar(int value){
        this.speed += value;
    }
}