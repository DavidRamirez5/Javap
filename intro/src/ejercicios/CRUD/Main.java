package ejercicios.CRUD;


public class Main {

       public static void main(String[] args) {
       
       CocheImpl cocheImpl = new CocheImpl();

        System.out.println("\n Simulacion CRUD");
        System.out.println(cocheImpl.findAll()); 
        System.out.println(" Agrgando Elementos");
        cocheImpl.save("Red Bull Racing RB18");
        cocheImpl.save("Ferrari F1-75");
        System.out.println(cocheImpl.findAll());
        System.out.println("Eleminiando Elemeto");
        cocheImpl.delete("Ferrari F1-75");
        System.out.println(cocheImpl.findAll());

        
    }
}
