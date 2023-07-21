package Ejercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(reverse("hola mundo"));

        //2
        String[] valores = {"Hola","mundo","como","va"};
        for(String valor: valores){
            System.out.println(valor);
        }

        //3
        Vector miVector = new Vector();
        miVector.add(1);
        miVector.add(3);
        miVector.add(5);
        miVector.add(7);
        miVector.add(9);
        miVector.remove(1);
        miVector.remove(2);
        System.out.println(miVector);

        //5
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("Esta");
        lista.add("Es");
        lista.add("Mi");
        lista.add("Lista");
        LinkedList<String> listaCopia = new LinkedList<String>(lista);
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
            System.out.println(listaCopia.get(i));
        }
        //6
        List<Integer> enteros = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            enteros.add(i);
        }
        for (int i=0;i<enteros.size();i++){
            if ((enteros.get(i)%2)==0) {
                enteros.remove(i);
            }
        }
        //7
        try{
            int resultado = dividePorCero();
        }
        catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de codigo");
        }
        //8

    }

    public static String reverse (String texto){
        String cadena = "";
        for(int i=texto.length()-1;i>=0;i--){
            cadena +=texto.charAt(i);
        }
        return cadena;
    }
    public static int dividePorCero() throws ArithmeticException{
        return 5/0;
    }
}
