import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        /*51. Implemente una sentencia switch que escriba un mensaje en cada caso (10 opciones).
        Inclúyala en bucle de prueba for (5 repeticiones). Utilice también un break tras cada caso y
        pruébelo.*/

        System.out.println("51. Implemente una sentencia switch que escriba un mensaje en cada caso (10 opciones).\n" +
                "Inclúyala en bucle de prueba for (5 repeticiones). Utilice también un break tras cada caso y\n" +
                "pruébelo.\n");

        int j ;

        for (int i = 1; i <= 5; i++){

            System.out.println("Ingrese un opción de 1 a 10");
            j = src.nextInt();
            switch (j){
                case 1:
                    System.out.println("opción 1");
                    break;
                case 2:
                    System.out.println("opción 2");
                    break;
                case 3:
                    System.out.println("opción 3");
                    break;
                case 4:
                    System.out.println("opción 4");
                    break;
                case 5:
                    System.out.println("opción 5");
                    break;
                case 6:
                    System.out.println("opción 6");
                    break;
                case 7:
                    System.out.println("opción 7");
                    break;
                case 8:
                    System.out.println("opción 8");
                    break;
                case 9:
                    System.out.println("opción 9");
                    break;
                case 10:
                    System.out.println("opción 10");
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        }
    }
}