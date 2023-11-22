import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*25. Dados dos números A y B sumarlos si al menos uno de ellos es negativo en caso contrario
        multiplicarlos.*/
        System.out.println("25. Dados dos números A y B sumarlos si al menos uno de ellos es negativo en caso contrario\n" +
                "multiplicarlos.");
        System.out.println("Ingrese el primer numero");
        number1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero");
        number2 = src.nextDouble();

        if(number1 < 0 || number2 < 0){
            double suma = number1+number2;
            System.out.println("La suma es: "+suma);
        }else{
            double mul = number1*number2;
            System.out.println("La multiplicacion es: "+mul);
        }

    }
}