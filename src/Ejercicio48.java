import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        /*48. Escribir un programa en Java que lea un número entero por el teclado e imprima todos los
        números impares menores que él.*/
        System.out.println("48. Escribir un programa en Java que lea un número entero por el teclado e imprima todos los\n" +
                "números impares menores que él.");
        System.out.println("Ingrese un numero entero");
        int i = src.nextInt();

        while (i > 0) {
            if (i % 2 != 0) {// cada vez que "i" es divisible por 2 (también conocido como número par) (i % 2)
                System.out.println(i);
            }
            i--;
        }

    }
}