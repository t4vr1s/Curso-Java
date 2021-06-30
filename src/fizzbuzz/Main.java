package fizzbuzz;

public class Main {
    /*
        encontrar multiplos de 3 escriben fizz, 5 escriben buzz,  3 y 5 escriben fizzbuzz y
        los demas escriben el numero correspondiente
        pista condicional if con el modulo % parecido a los pares.
        ejemplo de salida:
        1
        2
        fizz
        4
        buzz
        fizz
        7
        8
        fizz
        buzz
        ...
        14
        fizbuzz
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if(i%3==0 && i%5==0){ // multiplos de 3 y 5
                System.out.println("fizzbuzz");
                continue;
            } else if(i%5==0){ // multiplos de 5
                System.out.println("buzz");
                continue;
            } else if(i%3==0){ // multiplos de 3
                System.out.println("fizz");
                continue;
            }
            System.out.println(i);
        }
    }
}
