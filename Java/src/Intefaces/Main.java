package Intefaces;

public class Main {
    public static void main(String[] args) {
        CocheCRUD micoche = new CocheCRUDImpl();

        System.out.println(micoche.delete());
        System.out.println(micoche.findAll());
        System.out.println(micoche.save());
    }
}
