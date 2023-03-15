public class Main {
    public static void main(String[] args) {
        //Parte 1------------------------------------------
        int numerolf = -2;
        if (numerolf > 0){
            System.out.println("El numero es positivo");
        } else if (numerolf == 0) {
            System.out.println("Ausencia de valor");
        } else {
            System.out.println("el numero e negativo");
        }
        //Parte 2------------------------------------------
        int numeroWhile = -2;
        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
        //Parte 3------------------------------------------
        int numeroDoWhile = -2;
        do {
            numeroDoWhile ++;
            System.out.println(numeroDoWhile);
        }
        while (numeroDoWhile > 3);
        //Parte 4------------------------------------------
        int numeroFor;
        for (numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        //Parte 5-----------------------------------------
        String estacion="verano";
        switch (estacion){
            case ("verano"):
                System.out.println("Verano");
                break;
            case ("primavera"):
                System.out.println("Primavera");
                break;
            case ("otoño"):
                System.out.println("Otoño");
                break;
            case ("invierno"):
                System.out.println("Invierno");
                break;
            default:
                System.out.println("no se definio la estacion");
                break;
        }
    }
}