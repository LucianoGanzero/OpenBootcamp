package POO;

public class SmartWatch extends SmartDevice{
    private String colorMalla;

    public SmartWatch(){

    }
    public SmartWatch(String colorMalla, String color, int antiguedad, double memoria, double screenSize){
        super(memoria,color,screenSize,antiguedad);
        this.colorMalla=colorMalla;
    }

    public String getColorMalla() {
        return colorMalla;
    }
}
