// CCrear una funcion que reciba un precio y devuelva el precio con el IVA incuido.()
public class Funciones {
    public static void main(String[] args) {
        double priceIva;
        
        priceIva=getPriceWithIva(499);

        System.out.println("El precio con IVA es de: "+ priceIva);

    }

    static double getPriceWithIva(double price){
        return price + (price*0.16);
   }


}
