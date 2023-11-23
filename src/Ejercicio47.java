import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        /*46. 47. Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de
        los 100 número siguientes, mostrando el resultado en pantalla. (Ejemplo: el usuario digita
        5, se debe sumar 5+6+7+8+… hasta que complete 100 números)*/
        System.out.println("47. Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de\n" +
                "los 100 número siguientes, mostrando el resultado en pantalla. (Ejemplo: el usuario digita\n" +
                "5, se debe sumar 5+6+7+8+… hasta que complete 100 números)\n");
        System.out.println("Digite un numero del 1 - al 99");
        int i = src.nextInt();

        if(i < 1 || i >100){
            System.out.println("El numero es menor a 1 o mayor a 100");
        }else{
            int suma = 0;
            do {
                suma += i;
                //System.out.println(i);
                i++;
                System.out.println("suma "+suma);
            }while (i <= 100);
            System.out.println("la suma total es: "+suma);
        }

    }
}