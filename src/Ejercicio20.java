import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        /*20. Calcular el sueldo de los empleados de una empresa. Para ello se deberá pedir el nombre
        del empleado, las horas normales trabajadas y las horas extras. Tener en cuenta que el
        valor de la hora es de $4 y que las horas extras se pagan doble.*/
        System.out.println("20. Calcular el sueldo de los empleados de una empresa. Para ello se deberá pedir el nombre\n" +
                "del empleado, las horas normales trabajadas y las horas extras. Tener en cuenta que el\n" +
                "valor de la hora es de $4 y que las horas extras se pagan doble.");
        System.out.println("Ingrese su nombre");
        nombre = src.nextLine();
        System.out.println("Ingrese las horas trabajadas");
        number1 = src.nextDouble();
        System.out.println("Ingrese las horas extra trabjadas");
        number2 = src.nextDouble();
        double normalHour = 4, extraHour = 8, salary = 0;
        if(number2 > 0){
            salary = (normalHour*number1)+(extraHour*number2);
            System.out.println(nombre+" su sueldo es: $"+ salary);
        }else{
            salary = number1 *normalHour;
            System.out.println(nombre+" su sueldo sin horas extra es: $"+ salary);
        }

    }
}