package poo.clases;

// Metodo main que nos sirve para ejecutar el codigo.
public class Main{ // Clase Main
    public static void main(String[] args) { // Metodo main
        // Paradigma de programacion. 

        // Instanciado Motor

        Motor motor = new Motor("Honda",400,500);

        // Instanciado coche

        Coche f1 = new Coche("RB18","Red Bull Racing",2022,motor);
        System.out.println();
        System.out.println(f1.model);
        
    }
}