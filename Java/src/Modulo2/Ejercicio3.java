package Modulo2;

public class Ejercicio3 {

    public static void main(String[] args){
        String[] nombres = {"Luciano","Iara","Matias","Margarita","Fede","Jose"};
        String cadena ="";
        for(String nombre: nombres){
            cadena+= nombre+", ";
        }
        System.out.println(cadena);
    }

}
