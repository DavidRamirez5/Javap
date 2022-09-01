public class Bucle{
    public static void main(String[] args) {

        String [] names = {"Checo","Max","Andres","Bob"};

        System.out.println(Concatenar(names));
        
    }
    static String Concatenar(String [] arr){
        String names = " ";
        for(String name : arr){
                names += name + " ";
        }
        return names;
    }
}