import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*45. Escribir un programa en Java que multiplique los 20 primeros número naturales
        (1*2*3*4*5…).*/
        System.out.println("45. Escribir un programa en Java que multiplique los 20 primeros número naturales\n" +
                "(1*2*3*4*5…).\n");
        int i = 1, multiplicacion=1;

        while (i <= 20){

            //System.out.println(i+" x "+" = "+multiplicacion );
            i=i+1;
            multiplicacion=multiplicacion*i;
            //System.out.println("valor multi "+ multiplicacion);

            if(i == 20){
                System.out.println("VALOR FINAL\n"+i+" x "+multiplicacion+" = "+multiplicacion );
            }
        }
    }
}