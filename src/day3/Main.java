package day3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) { // main
        String nombre = "eduardo";
        int num = 2;

        // estructura de datos ARRAY o VECTOR almacena un tipo de dato

        // array de strings
        String[] nombres = {"Eduardo", "Graci", "Fabian", "22", "Saludo"};
        //                      0         1         2       3

        // array de enteros
        int[] numeros = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(nombres[1]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);

        System.out.println("muestra la cantidad de elementos del array: " + nombres.length);

        // for tradicional
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("desde el ciclo for: " + nombres[i]);
        }

        // for each (recomendado) exclusivo para arrays
        for(int numero: numeros){
            System.out.println(numero);
        }

        // array multidimensionales o matriz
        System.out.println("ARRAY MULTIDIMENSIONALES");
        // son arrays dentro de un array
        int[][] numeros2 = {{1,2,3,4}, {5,6,7,8}};
        // posision             0          1

        int positionFinal = numeros2[1][3];
        System.out.println(numeros2[0][2]);
        System.out.println(numeros2[1][1]);
        System.out.println(positionFinal);

        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++) {
                System.out.println(numeros2[i][j]);
            }
        }

        System.out.println("Llamando funciones");
        saludo();
        saludo();

        // debe pasar un argumento
        saludo2("Eduardo");

        // retorna un valor (una suma)
        int resultado = sumar(2,5);
        System.out.println("la suma es: " +resultado);
        System.out.println("la segunda suma es: " + sumar(4,6));

        // llamar al Scanner
        Scanner sc = new Scanner(System.in);
        // Ingresar los valores
        System.out.println("Ingrese numero 1");
        int num1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = sc.nextInt();

        // llamar a la funcion sumar
        System.out.println("pasando los valores por la terminal. El resultado es: " + sumar(num1,num2));
        System.out.println("llamando a la funcion con sobre carga sumar double. El resultado es: " + sumar(3.5,5.4));

        System.out.println("el valor de la funcion verdad es: " + verdad());

    }

    // funciones

    // funcion sin retorno (void no retorna)
    static void saludo() {
        System.out.println("Hola mundo!!");
    }

    // funcion sin retorno con parametros (no retorna)
    static void saludo2(String nombre) {
        System.out.println("Hola "+ nombre);
    }

    // funcion con retorno
    static int sumar(int num1, int num2){
        return num1 + num2;
    }
    // sobre carga de metodos(funcion)
    static double sumar(double num1, double num2){
        return num1 + num2;
    }

    // retorna un valor sin pasar parametros a la funcion
    static String verdad(){
        return "Mensaje desde verdad";
    }


}

