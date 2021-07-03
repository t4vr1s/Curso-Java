package tarea2;

import java.util.Scanner;

public class Main {
    // Se ingresa nombre y 3 notas de N alumnos. Mostrar por cada alumno el mensaje de acuerdo al promedio obtenido:
    // Si promedio esta entre 1 y 3,9 imprimir datos y mensaje “Es mala nota.”
    // Si promedio esta entre 4 y 5 imprimir datos y mensaje “Es suficiente.”
    // Si promedio esta entre 5,1 y 6 imprimir datos y mensaje “Es buena nota.”
    // Si promedio esta entre 6,1 y 7 imprimir datos y mensaje “Es muy buena nota.”

    public static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;
        float promedio;
        float suma;

        Scanner teclado = new Scanner(System.in);

while(true){
do {
    System.out.println(" -------INGRESA UNA NOTA VALIDA ------");

    System.out.println(" INGRESE NOTA 1");
    nota1 = teclado.nextFloat();
}while(nota1>7|| nota1 <1);
do {
    System.out.println(" INGRESE NOTA 2");
    nota2 = teclado.nextFloat();
}while ( nota2>7 || nota2 <1);
do {
    System.out.println(" INGRESE NOTA 3");
    nota3 = teclado.nextFloat();
}while(nota3 >7 || nota2 <1);

    promedio = (nota1 + nota2 + nota3) / 3;

    System.out.println(promedio);


    if (promedio >=6 || promedio ==7){
        System.out.println("Eres seco muy buena nota");
    }else if (promedio >=5 || promedio == 6){
        System.out.println("Es buena nota");
    }else if(promedio >=4 || promedio ==5 ){
        System.out.println(" Es suficiente");
    }else if (promedio>=1 || promedio <4){
        System.out.println("Es mala nota");
    }

    }
}
}