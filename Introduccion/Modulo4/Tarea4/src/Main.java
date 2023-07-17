
public class Main {
    public static void main(String[] args) {
        int numeroif=0;
        System.out.println("Esto es en if:");
        if (numeroif==0){
            System.out.println("Es 0");
        }
        else if (numeroif <0){
            System.out.println("Es negativo");
        }
        else if(numeroif>0){
            System.out.println("Es positivo");
        }

        int numeroWhile =0;
        System.out.println("Esto es el while:");
        while (numeroWhile <3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("Esto es el do-while:");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile<3);

        System.out.println("Esto es el for:");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        String estacion = "Invierno";
        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
        }

    }
}