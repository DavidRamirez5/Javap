package poo.ejercicio;

public class Main {
    public static void main(String[] args) {
        
        

        SmartPhone iPhone = new SmartPhone("Apple","iPhone 13","Azul", 17999, true);
        
        SmartWatch appleWatch = new SmartWatch("Apple","Series 7","Blanco",9999 ,"Roja");

        // Imprimiendo atributos atraves del .

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);

        System.out.println(appleWatch.model);
        System.out.println(appleWatch.color);

        // Metodos.

        iPhone.call("Checo Perez");
        iPhone.turnOff();

        appleWatch.turnOn();
        appleWatch.getDate();



        

    }
}
