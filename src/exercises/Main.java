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
        do{
        //menu
        System.out.println("Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. RESTAR");
        System.out.println("3. DIVISION");
        System.out.println("4. MULTIPLICACION");
        System.out.println("5. MODULO");
        System.out.println("0. EXIT");

        op = sc.nextInt(); // inicializa el valor de op

    switch (op){ //Variable 'op' might not have been initialized
        case 1:
            System.out.println("la suma de los valores ingresados es: " + (num1 + num2));
            break;

        case 2:
            System.out.println("la resta de los valores ingresados es: " + (num1  - num2));
            break;
        case 3:
            System.out.println(" la division de los valores es : " + (num1 / num2));
            break;

        case 4:
            System.out.println(" la multiplicacion de los valores : "+ (num1* num2));
            break;
        case 5:
            int suma=0;
            suma= num1 + num2;
            System.out.println("el residuo de  : " +  suma + " , entre 2 es:  "+ suma % 2);

            break;

        default:
            System.out.println("USTED HA SALIDO SATISFACTORIAMENTE! ");
            break;
    }

}while(op !=0 );

    }
}
