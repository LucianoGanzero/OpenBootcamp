package POO;

public class Main {

    public static void main(String[] args){
        SmartWatch reloj = new SmartWatch("Negro","Negro",2,4.0,3.0);
        SmartPhone celular = new SmartPhone(30, "Blanco", 1,4.0,7.5);

        System.out.println("El celular es de color "+celular.getColor()+", tiene "+celular.getAntiguedad()+" año de antiguedad, una pantalla de "+
                celular.getScreenSize()+" pulgadas, y una bateria de "+ celular.getDuracionBateria());
    }
}
