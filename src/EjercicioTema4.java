public class EjercicioTema4 {
    public static void main(String[] args) {
        bloqueIf();
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        bloqueSwitch();
    }

    private static void bloqueIf(){
        int numeroIf = 0;
        if(numeroIf < 0){
            System.out.println("Valor de numeroIf es NEGATIVO");
        } else if (numeroIf > 0){
            System.out.println("Valor de numeroIF es POSITIVO");
        } else {
            System.out.println("Valor de numeroIf es CERO");
        }
    }

    private static void bucleWhile(){
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Valor de numeroWhile es " + numeroWhile);
            numeroWhile++;
        }
    }

    private static void bucleDoWhile(){
        int numeroDoWhile = 2;
        do {
            System.out.println("Valor de numeroDoWhile es " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }

    private static void bucleFor(){
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Valor de numeroFor es " + numeroFor);
        }
    }

    private static void bloqueSwitch(){
        String estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("Estamos en la estacion " + estacion);
                break;
            case "INVIERNO":
                System.out.println("Estamos en la estacion " + estacion);
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en la estacion " + estacion);
                break;
            case "OTOÑO":
                System.out.println("Estamos en la estacion " + estacion);
                break;
            default:
                System.out.println("Estación ingresada no identificada");
                break;
        }
    }
}
