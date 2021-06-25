package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variables
        int num1;
        int num2;
        int op;
        float resultado; // 1.0 2.0

        // objeto que permite leer el valor ingresado
        Scanner sc = new Scanner(System.in); // new crea objeto

        // pedir y capturar valor desde la consola
        System.out.println("Ingrese valor 1"); // validar que sea un entero
        num1 = sc.nextInt();
        System.out.println("Ingrese valor 2");
        num2 = sc.nextInt();

        do {
            // menu con 5 opciones
            System.out.println("----------------------");
            System.out.println("MENU");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. MODULO");
            System.out.println("6. SUMAR E IMPRIMIR PARES");
            System.out.println("7. SUMAR E IMPRIMIR IMPARES"); // PENDIENTE
            System.out.println("8. TABLA DE MULTIPLICAR");
            System.out.println("9. BREAK");
            System.out.println("10. CONTINUE");
            System.out.println("11. METHOD STRING");
            System.out.println("0. SALIR");

            op = sc.nextInt();

            // calculos matematicos
            switch (op) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("la suma de num1 y num 2 es: " + resultado);
                    break;
                case 2:
                    System.out.println("la resta de num1 y num2 es: " + (num1 - num2));
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("la multiplicacion de mun1 y num2 es: " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("la divicion de mun1 y num2 es: " + resultado);
                    break;
                case 5:
                    resultado = num1 % num2;
                    System.out.println("el resto de la divicion de mun1 y num2 es: " + resultado);
                    break;
                case 6:
                    resultado = num1 + num2; // 5 + 8 = 13
                    for (int i = 1; i < resultado; i++) {
                        if (i % 2 == 0) {
                            System.out.println("el valor: " + i + " es par");
                        }
                    }
                    break;
                case 7:
                    resultado = num1 + num2; // 5 + 8 = 13
                    for (int i = 1; i < resultado; i++) {
                        if (i % 2 != 0) {
                            System.out.println("el valor: " + i + " es impar");
                        }
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el numero de la tabla");
                    int tabla = sc.nextInt();
                    System.out.println("Ingrese hasta que numero multiplicar");
                    int hasta = sc.nextInt();

                    int contador = 1;
                    while (contador <= hasta) {
                        System.out.println(tabla + " X " + contador + " = " + (tabla * contador));
                        contador++;
                    }
                    break;
                case 9:
                    for (int i = 0; i < 10; i++) {
                        if (i == 6) {
                            break; // detiene la ejecucion del for
                        }
                        System.out.println(i);
                    }
                    break;
                case 10:
                    for (int i = 0; i < 10; i++) {
                        if (i == 6) {
                            continue; // salta al ciclo siguiente
                        }
                        System.out.println(i);
                    }
                    break;
                case 11:
                    String saludo = "Hola. que tal?";
                    System.out.println(saludo.length());
                    for (int i = 0; i < saludo.length(); i++) {
                        System.out.println(i);
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion entre 0 y 5");
                    break;
            }

        } while (op != 0);
    }
}
