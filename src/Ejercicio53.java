import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        Scanner src = new Scanner(System.in);

        /*52. 53. Muestre por pantalla la tabla de multiplicar que el usuario desee.*/

        System.out.println("53. Muestre por pantalla la tabla de multiplicar que el usuario desee.");
        System.out.println("Ingrese un numero");
        number1 = src.nextDouble();

        System.out.println("Tabla del "+number1);
        for(int i = 1; i<=10 ;i++){
            System.out.println(number1+" * "+i+" = "+number1*i);
        }

    }
}