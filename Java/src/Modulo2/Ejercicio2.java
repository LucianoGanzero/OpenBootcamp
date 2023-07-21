package Modulo2;

public class Ejercicio2 {

    public static void main(String[] args){

        System.out.println(getPrecioMasIva(20));


    }

    static double getPrecioMasIva(double precio){
        return precio+= precio*0.21;
    }
}
