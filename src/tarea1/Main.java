package tarea1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ingresar una edad y nombre. comparar si es mayor(>18) de edad, menor(<18) o un adulto mayor(65)
        // mostrar mensaje con nombre edad y en caso de ser
        // adulto mostrar cuanto anios le faltan para ser un adulto mayor
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        int op;

while(true){
    System.out.println("INGRESE SU NOMBRE");
    nombre=sc.next();
    System.out.println( "INGRESE SU EDAD");
    edad= sc.nextInt();
    if ( edad > 18 && edad < 65) {
        System.out.println(nombre + " Eres Mayor de edad  y le faltan  "+(65 - edad)+ "  para ser adulto mayor");
    }
    else if (edad < 18 ){
        System.out.println(nombre + " Eres Menor de edad");
    }else if(edad > 65 ){
        System.out.println(nombre + " eres adulto   mayor ");
    }


}










        }
    }

