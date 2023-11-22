import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*23. numDia es una variable numérica que puede tomar 7 valores, ellos son 1, 2, 3, 4, 5, 6 o 7.
        Mostar el nombre el nombre del día de la semana que corresponde al valor de la variable
        numDia.*/
        System.out.println("23. numDia es una variable numérica que puede tomar 7 valores, ellos son 1, 2, 3, 4, 5, 6 o 7.\n" +
                "Mostar el nombre el nombre del día de la semana que corresponde al valor de la variable\n" +
                "numDia.\n");

        int day = 0;
        System.out.println("Ingrese un numero del 1 al 7");
        day = src.nextInt();
        if(day == 1){
            System.out.println("Lunes");
        }else{
            if(day == 2){
                System.out.println("Martes");
            }else{
                if(day==3){
                    System.out.println("Miercoles");
                }else{
                    if(day==4){
                        System.out.println("Jueves");
                    }else{
                        if(day==5){
                            System.out.println("Viernes");
                        }else{
                            if(day==6){
                                System.out.println("Sabado");
                            }else{
                                if(day==7){
                                    System.out.println("Domingo");
                                }else {
                                    System.out.println("El numero ingresado no esta entre 1-7");
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}