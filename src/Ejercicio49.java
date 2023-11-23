import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        /*49. Halle el número factorial de un número ingresado por el usuario*/
        System.out.println("49. Halle el número factorial de un número ingresado por el usuario");

        double n;
        double factorial = 1;

        do {  //introducir por teclado un número mayor o igual a cero
            System.out.print("Introduce un numero entero >= 0: ");
            n = src.nextDouble();
        } while (n < 0);

        //multiplicar todos los números desde 1 hasta n
        //el resultado de las multiplicaciones se acumula en la variable factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        //mostrar el resultado
        System.out.println( n+" = "+ factorial);


    }
}