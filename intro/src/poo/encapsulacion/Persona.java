package poo.encapsulacion;

class Persona{
   
    private int age;
    private String name;
    
    private String phone;

    public Persona(){
    }
    
    // Creando Getters and Setters de cada atributo

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    
    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}