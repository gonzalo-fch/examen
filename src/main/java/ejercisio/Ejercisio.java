package ejercisio;

import java.util.Scanner;

public class Ejercisio {
    public static void main (String [] args){
        int dim, primos=0;

        dim= leerDim();
        int vector[]= new int [dim];
        llenarVector(vector);
        mostrarVector(vector);

        for (int i=0; i< vector.length;i++){
            if(buscarPrimos(vector[i])){
                primos++;
            }


        }
        int vectorPrimos[]= new int[primos];

        copiar(vector, vectorPrimos);
        mostrarVector(vectorPrimos);

    }

    private static void copiar(int[] vector, int[] vectorPrimos) {
        int coordenada=0;
        int primo=0;
        for (int i=0; i< vector.length;i++){
            if(buscarPrimos(vector[i])){
                primo= vector[i];
                vectorPrimos[coordenada]=primo;
                coordenada++;
            }
            
        }

        }

    private static boolean buscarPrimos(int numero) {
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;

    }

    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);

        }
    }

    private static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) ((Math.random()*99)+1);

        }


    }

    private static int leerDim() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese la dimencion");
        return teclado.nextInt();
    }



}
