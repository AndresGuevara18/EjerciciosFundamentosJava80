import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        Scanner src = new Scanner(System.in);

        /*52. Imprima los números primos hasta un número ingresado por el usuario..*/

        /*System.out.println("52. Imprima los números primos hasta un número ingresado por el usuario.");
        System.out.println("Ingrese un numero");
        number1 = src.nextDouble();

        for(int i = 1; i <= number1; i++){
            System.out.println(i);



        }*/

        int N, i, j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);

        for (j = 2; j <= N; j++) {    // j es el número que se comprueba si es primo
            i = 2;                // i son los divisores

            while (j % i != 0) {
                i++;
            }
            if (i == j) { // si se ha dividido por el propio número entonces es primo
                System.out.println(j);
            }
        }

    }
}