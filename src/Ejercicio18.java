import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*18. Escribir un programa en Java que lea dos números del teclado y diga cuál es el mayor y
        cual el menor.*/
        System.out.println("18. Escribir un programa en Java que lea dos números del teclado y diga cuál es el mayor y\n" +
                "cual el menor.\n");
        System.out.println("Ingrese un número");
        number1 = src.nextDouble();
        System.out.println("Ingrese otro número");
        number2 = src.nextDouble();

        if(number1 == number2){
            System.out.println("Son iguales");
        }else if(number1 > number2 ){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("el segundo numero es mayor");
        }





    }
}