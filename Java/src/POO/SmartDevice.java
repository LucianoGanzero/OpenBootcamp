package POO;

public abstract class SmartDevice {
    private double memoria;
    private String color;
    private double screenSize;
    private int antiguedad;

    public SmartDevice(){

    }
    public SmartDevice(double memoria, String color, double screenSize, int antiguedad){
        this.color=color;
        this.memoria=memoria;
        this.screenSize=screenSize;
        this.antiguedad=antiguedad;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
