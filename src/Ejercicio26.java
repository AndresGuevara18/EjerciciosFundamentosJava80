import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0, number3 = 0;
        String nombre ="";
        Scanner src = new Scanner(System.in);

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

    }
}