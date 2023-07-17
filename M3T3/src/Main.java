// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        int result = sumar(10,20,30);
        System.out.println(result);

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.getPuertas());
    }
    public static int sumar(int a,int b, int c){
        return a+b+c;
    }
}