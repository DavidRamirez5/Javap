package poo.encapsulacion;

class App{
    public static void main(String[] args) {
        
        System.out.println("Encapsulación");

        Persona andres = new Persona();

        // Utilizando getters y setters

        andres.setAge(22);
        System.out.println(andres.getAge());
        andres.setName("Andrés Ramirez");
        System.out.println(andres.getName());
        andres.setPhone("5555555555");
        System.out.println(andres.getPhone());
    }
}