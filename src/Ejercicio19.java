import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*19. Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en
        pantalla el menor y el mayor de todos ellos.*/
        System.out.println("19. Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en\n" +
                "pantalla el menor y el mayor de todos ellos. ");
        System.out.println("Ingrese el primer número");
        number1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        number2 = src.nextDouble();
        System.out.println("Ingrese el tercer número");
        number3 = src.nextDouble();

        if(number1 > number2 ){
            if(number1 > number3){
                System.out.println("el primer numero es mayor: "+number1);
            }else {
                System.out.println("el tercer numero es mayor: "+number3);
            }
        }else if(number2 > number3 ){
            System.out.println("el segundo numero es mayor: "+number2);
        }else{
            System.out.println("el tercer numero es mayor: "+number3);
        }

    }
}