import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        //ARREGLO ENTERO inicializado en una linea
        int[] arregloEntero ={1, 5, 3, 50, 5, 6, 70, 8, 9};
        System.out.println(arregloEntero[3]);//mostrar pantalla el numero 50

        //imprimir el arreglo for
        System.out.println("\nImprimir arreglo entero bucle for");
        for(int i = 0; i < arregloEntero.length; i++){//.length meide el total del arreglo de 0 hasta la extension del arreglo
            System.out.println("valor indice "+i+" = "+arregloEntero[i]);
        }
        //for each
        System.out.println("\nImprimir arreglo entero bucle for each");
        for(int arreForEacEnt: arregloEntero) {
            System.out.println("imprimir arreglo for each " + arreForEacEnt);
        }

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //numero de elementos que almacena el arreglo sin valores
        int[] mi_matriz = new int[5];
        //int mi_matriz2[] = new int[5];//segunda nomenclatura

        //poiscion de la variable y valor del arreglo
        mi_matriz[0] =12;
        mi_matriz[1] =25;
        mi_matriz[2] =8;
        mi_matriz[3] =-7;
        mi_matriz[4] =92;
        System.out.println("valor arreglo"+mi_matriz[3]);//un elemento
        //todos los elementos
        System.out.println("\nImprimir arreglo bucle for/each\n");
        //for each
        int i = 0;
        for(int arreForEac: mi_matriz) {
            System.out.println("valor i "+i +"  imprimir arreglo for each " + arreForEac);
            i++;
        }
        //for
        System.out.println("Imprimir arreglo bucle for");
        for(int j = 0; j < 5; j++){//.length meide el total del arreglo
            System.out.println("Valor indice "+j+" = " +mi_matriz[j]);
        }

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //DOS ARREGLOS
        System.out.println("-----------------"+"\nDos Arreglos");
        String[] alumno ={"A", "B", "C", "d"};
        int[] arregloNotas ={1, 2, 3, 4};
        System.out.println("Nombre: "+alumno[3]+"   Nota: "+arregloNotas[1]);

        int k = 0;//nombre otra valariable por que mas  arriba ya existe i
        for(String elementoAlumno: alumno) {
            System.out.println("Valor indice: "+k +" for each string nombre alumno" + elementoAlumno);
            k++;
        }

        int l =0;
        for(int elementoNota: arregloNotas){
            System.out.println("Valor indice notas: "+l+" for each int notas "+elementoNota);
            l++;
        }



        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Arreglo boolean
        boolean[] arregloBoo = {true, true, false, true};
        System.out.println("------------\n"+"Arreglo Boolean");
        System.out.println(arregloBoo[3]);

        /*

ARREGLOS EN JAVA
- estructuras de datos
- variables: Tipo de dato, nombre y la incializacion
-Arreglos: tipo[] nombreArreglo= {}

int[] arregloEntero ={  --> inicializar arreglo entero vacio};
int[] arregloEntero ={}
int[] arregloEntero ={0,1,2,3,4};


*/



    }
}