// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Luciano");
        cliente.setEdad(29);
        cliente.setTelefono("555-5555");
        cliente.setCredito(500.5);
        System.out.println(cliente.getNombre() +" " +
                            cliente.getEdad()+ " " +
                            cliente.getTelefono()+ " "+
                        cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Iara");
        trabajador.setEdad(25);
        trabajador.setTelefono("555-5565");
        trabajador.setSalario(500.5);
        System.out.println(trabajador.getNombre() +" " +
                trabajador.getEdad()+ " " +
                trabajador.getTelefono()+ " "+
                trabajador.getSalario());
    }
}
class Persona{
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}