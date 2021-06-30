package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // calculadora con las 4 operaciones matematicas basicas (+,-,/,*)
        // agregar los numeros por la terminal.

        // variables
        Scanner sc = new Scanner(System.in); // agregar datos por la terminal
        int num1 = 0; // variable entera inicializada (porque tiene un valor)
        int num2;
        int op; // variable declarada


        // ingresamos valores por la terminal
        System.out.println("ingrese un valor");
        num1 = sc.nextInt();
        System.out.println("ingrese segundo valor");
        num2 = sc.nextInt();

        //menu
        System.out.println("Calculadora");
        System.out.println("1. Sumar");
        op = sc.nextInt(); // inicializa el valor de op

        switch (op){ //Variable 'op' might not have been initialized
            case 1:
                System.out.println("la suma de los valores ingresados es: " + (num1 + num2));
                break;
            default:
                System.out.println("opcion incorrecta. escoja 1,2,3,4,5");
                break;
        }
    }
}
