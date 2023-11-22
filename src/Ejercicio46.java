import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*46. Escribir un programa en Java que sume los cuadrados de los cien primeros números
        naturales, mostrando el resultado en pantalla.*/
        System.out.println("46. Escribir un programa en Java que sume los cuadrados de los cien primeros números\n" +
                "naturales, mostrando el resultado en pantalla.\n");
        int i = 0;
        double suma=0;
        while (i <= 100){
            i=i+1;
            int cuadrado  = (int)Math.pow(i,2);
            suma = suma+cuadrado;
            //System.out.println(i+ " cuadrado:   "+cuadrado+"   suma "+suma);

            if(i == 100){
                System.out.println("La suma total es: "+suma);
            }
        }

    }
}