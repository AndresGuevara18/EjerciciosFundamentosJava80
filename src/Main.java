import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

        //18. Escribir un programa en Java que lea dos números del teclado y diga cuál es el mayor y
        //cual el menor.
        /*System.out.println("18. Escribir un programa en Java que lea dos números del teclado y diga cuál es el mayor y\n" +
                "cual el menor.\n");
        System.out.println("Ingrese un número");
        number1 = src.nextDouble();
        System.out.println("Ingrese otro número");
        number2 = src.nextDouble();

        if(number1 == number2){
            System.out.println("Son iguales");
        }else if(number1 > number2 ){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("el segundo numero es mayor");
        }*/


        //19. Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en
        //pantalla el menor y el mayor de todos ellos.
        /*System.out.println("19. Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en\n" +
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
        }*/

        //20. Calcular el sueldo de los empleados de una empresa. Para ello se deberá pedir el nombre
        //del empleado, las horas normales trabajadas y las horas extras. Tener en cuenta que el
        //valor de la hora es de $4 y que las horas extras se pagan doble.
        /*System.out.println("20. Calcular el sueldo de los empleados de una empresa. Para ello se deberá pedir el nombre\n" +
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
        }*/

        //21. Dados dos números A y B sumarlos si A es menor a B sino restarlos
        /*System.out.println("21. Dados dos números A y B sumarlos si A es menor a B sino restarlos");
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
        }*/

        //23. numDia es una variable numérica que puede tomar 7 valores, ellos son 1, 2, 3, 4, 5, 6 o 7.
        //Mostar el nombre el nombre del día de la semana que corresponde al valor de la variable
        //numDia.
        /*System.out.println("23. numDia es una variable numérica que puede tomar 7 valores, ellos son 1, 2, 3, 4, 5, 6 o 7.\n" +
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
        }*/

        //24. Dadas las longitudes de los tres lados de un triángulo determinar si es equilátero o no
        /*System.out.println("24. Dadas las longitudes de los tres lados de un triángulo determinar si es equilátero o no");
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
        }*/

        //25. Dados dos números A y B sumarlos si al menos uno de ellos es negativo en caso contrario
        //multiplicarlos.
        /*System.out.println("25. Dados dos números A y B sumarlos si al menos uno de ellos es negativo en caso contrario\n" +
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
        }*/

        //26. Pidiendo el día y el mes de nacimiento mostrar el signo
        System.out.println("26. Pidiendo el día y el mes de nacimiento mostrar el signo  (2023)");
        System.out.println("Ingrese su dia de nacimiento");
        number1 = src.nextDouble();
        System.out.println("Ingrese su mes de nacimiento (1-12)");
        number2 = src.nextDouble();

        if (number2 == 1) {
            if(number1 >= 22 && number1<= 31){
                System.out.println("Acuario");
            }else if(number1 >= 1 && number1 <=21){
                System.out.println("Capricornio");
            }else{
                System.out.println("el Dia NO es valido");
            }
        }else{
            if(number2 ==2){
                if(number1 >= 19 && number1<= 28){
                    System.out.println("Piscis");
                }else if(number1 >= 1 && number1 <=18){
                    System.out.println("Acuario");
                }else{
                    System.out.println("el Dia NO es valido");
                }
            }else {
                if(number2 ==3){
                    if(number1 >= 21 && number1<= 31){
                        System.out.println("Aries");
                    }else if(number1 >= 1 && number1 <=20){
                        System.out.println("Piscis");
                    }else{
                        System.out.println("el Dia NO es valido");
                    }
                }else{
                    if(number2 == 4){
                        if(number1 >=20 && number1<= 30){
                            System.out.println("Tauro");
                        }else if(number1 >= 1 && number1 <=19){
                            System.out.println("Aries");
                        }else{
                            System.out.println("el Dia NO es valido");
                        }
                    }else{
                        if(number2 == 5){
                            if(number1 >= 21 && number1<= 31){
                                System.out.println("Géminis");
                            }else if(number1 >= 1 && number1 <=20){
                                System.out.println("Tauro");
                            }else{
                                System.out.println("el Dia NO es valido");
                            }
                        }else{
                            if(number2 == 6){
                                if(number1 >= 21 && number1<= 30){
                                    System.out.println("Cáncer");
                                }else if(number1 >= 1 && number1 <=20){
                                    System.out.println("Géminis");
                                }else{
                                    System.out.println("el Dia NO es valido");
                                }
                            }else{
                                if(number2 == 7){
                                    if(number1 >= 23 && number1<= 31){
                                        System.out.println("Leo");
                                    }else if(number1 >= 1 && number1 <=22){
                                        System.out.println("Cáncer");
                                    }else{
                                        System.out.println("el Dia NO es valido");
                                    }
                                }else{
                                    if(number2 == 8){
                                        if(number1 >= 23 && number1<= 31){
                                            System.out.println("Virgo");
                                        }else if(number1 >= 1 && number1 <=22){
                                            System.out.println("Leo");
                                        }else{
                                            System.out.println("el Dia NO es valido");
                                        }
                                    }else{
                                        if(number2 == 9){
                                            if(number1 >= 23 && number1<= 30){
                                                System.out.println("Libra");
                                            }else if(number1 >= 1 && number1 <=22){
                                                System.out.println("Virgo");
                                            }else{
                                                System.out.println("el Dia NO es valido");
                                            }
                                        }else{
                                            if(number2 == 10){
                                                if(number1 >= 23 && number1<= 31){
                                                    System.out.println("Escorpio");
                                                }else if(number1 >= 1 && number1 <=22){
                                                    System.out.println("Libra");
                                                }else{
                                                    System.out.println("el Dia NO es valido");
                                                }
                                            }else{
                                                if(number2 == 11){
                                                    if(number1 >= 22 && number1<= 30){
                                                        System.out.println("Sagitario");
                                                    }else if(number1 >= 1 && number1 <=21){
                                                        System.out.println("Escorpio");
                                                    }else{
                                                        System.out.println("el Dia NO es valido");
                                                    }
                                                }else{
                                                    if(number2 == 12){
                                                        if(number1 >= 22 && number1<= 31){
                                                            System.out.println("Capricornio");
                                                        }else if(number1 >= 1 && number1 <=21){
                                                            System.out.println("Sagitario");
                                                        }else{
                                                            System.out.println("el Dia NO es valido");
                                                        }
                                                    }else{
                                                        System.out.println("No ingreso el mes correcto");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        //45. Escribir un programa en Java que multiplique los 20 primeros número naturales
        //(1*2*3*4*5…).
        /*System.out.println("45. Escribir un programa en Java que multiplique los 20 primeros número naturales\n" +
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
        }*/

        //46. Escribir un programa en Java que sume los cuadrados de los cien primeros números
        //naturales, mostrando el resultado en pantalla.
        /*System.out.println("46. Escribir un programa en Java que sume los cuadrados de los cien primeros números\n" +
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
        }*/


    }
}