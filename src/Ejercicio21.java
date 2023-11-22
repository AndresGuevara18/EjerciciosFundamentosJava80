import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*21. Dados dos números A y B sumarlos si A es menor a B sino restarlos*/
        System.out.println("21. Dados dos números A y B sumarlos si A es menor a B sino restarlos");
        System.out.println("Ingrese el primer numero");
        number1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero");
        number2 = src.nextDouble();

        if(number1 > number2){
            double suma = number1+number2;
            System.out.println("La suma es:"+suma);
        }else{
            double resta = number1-number2;
            System.out.println("La resta es: "+resta);
        }

    }
}