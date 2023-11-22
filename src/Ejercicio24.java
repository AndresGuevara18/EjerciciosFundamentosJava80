import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*24. Dadas las longitudes de los tres lados de un triángulo determinar si es equilátero o no*/
        System.out.println("24. Dadas las longitudes de los tres lados de un triángulo determinar si es equilátero o no");
        System.out.println("ingrese longitud del primer lado");
        number1 = src.nextDouble();
        System.out.println("ingrese longitud del segundo lado");
        number2 = src.nextDouble();
        System.out.println("ingrese longitud del tercer lado");
        number3 = src.nextDouble();

        if(number1 == number2 && number1 == number3 && number2==number3){
            System.out.println("Triangulo equilatero");
        }else{
            System.out.println("el Triangulo NO es equilatero");
        }

    }
}