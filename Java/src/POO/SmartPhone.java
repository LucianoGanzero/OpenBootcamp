package POO;

public class SmartPhone extends SmartDevice{
    private double duracionBateria;

    public SmartPhone(){

    }
    public SmartPhone(double duracionBateria, String color, int antiguedad, double memoria, double screenSize){
        super(memoria,color,screenSize,antiguedad);
        this.duracionBateria=duracionBateria;
    }

    public double getDuracionBateria() {
        return duracionBateria;
    }
}
