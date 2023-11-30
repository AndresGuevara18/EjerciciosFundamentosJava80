import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        double number1 = 0,  cant = 0, positive = 0, negative=0, neu=0;
        Scanner src = new Scanner(System.in);

        /*55. Construya el algoritmo que permita el ingreso de una serie de números y que determine
        cuantos números positivos, cuantos números negativos y cuantos ceros hay. Como primer
        dato pedir la cantidad de números que forman la lista.*/

        System.out.println("55. Construya el algoritmo que permita el ingreso de una serie de números y que determine\n" +
                "cuantos números positivos, cuantos números negativos y cuantos ceros hay. Como primer\n" +
                "dato pedir la cantidad de números que forman la lista.");
        System.out.println("Ingrese la cantidad de números");
        cant = src.nextDouble();

        for(int i=1; i <= cant; i++){
            System.out.println("Ingrese un número #"+i);
            number1 = src.nextDouble();

            if(number1 > 0){
                positive = positive+1;
            }else if(number1 < 0){
                negative = negative+1;
            }else{
                neu = neu+1;
            }
        }

        System.out.println("Ingreso "+positive+" número positivos.");
        System.out.println("Ingreso "+negative+" número negativos.");
        System.out.println("Ingreso "+neu+" número neutros.");

    }
}