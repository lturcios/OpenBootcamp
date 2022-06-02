public class EjercicioTema3 {
    public static void main(String[] args) {

        int val1 = 11;
        int val2 = 12;
        int val3 = 13;

        System.out.println(sumar(val1, val2, val3));
        System.out.println(sumar(1, 2, 3));

        // Creando miCoche
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int sumar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static class Coche {
        int puertas = 0;

        public void AgregarPuerta(){
            this.puertas++;
        }
    }

}
