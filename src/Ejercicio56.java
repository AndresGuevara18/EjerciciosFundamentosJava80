import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        int number1 = 1;

        Scanner src = new Scanner(System.in);

        /*59. Hacer un programa que muestre las tablas de multiplicar del 1 al 9. Cada tabla debe tener
        su título.*/

        System.out.println("59. Hacer un programa que muestre las tablas de multiplicar del 1 al 9. Cada tabla debe tener\n" +
                "su título.");



        for(int i=1; i <= 10; i++){
            System.out.println("\nTABLA DE MULTIPLICAR DEL "+i);
            for(int j=1; j <= 10; j++){
                System.out.println(j +" * "+i+" = "+j*i);
            }
        }

    }
}