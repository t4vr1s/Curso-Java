package day4;

public class Main {
    public static void main(String[] args) {
        // java tiene 8 datos primitivos
        // byte, short, int, long
        // char
        // boolean
        // float, double

        // CHAR
        char caracter = 'a'; // se declaran entre comilla simple
        char arroba = 64;


        System.out.println("los caracteres " + caracter);
        System.out.println("codigo ascii " + arroba);

        // BOOLEAN
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(" valor booleano " + isTrue);
        System.out.println(2 == 2);
        System.out.println("e" == "a");

        // for tradicional

        // declaracion  int i = 0
        // evaluacion i < 4
        // aumento de la variable i++
        System.out.println("dentro del for");
        for (int i = 0; i < 4; i++) {
            System.out.println(i<4);
            System.out.println(i);
        }

        System.out.println("BYTE ");
        byte miByte = -127;
        System.out.println("valor tipo byte " + miByte);
        System.out.println("valor maximo soportado " + Byte.MAX_VALUE );
        System.out.println("valor minimo soportado " + Byte.MIN_VALUE ); // clases wrapper

        System.out.println("SHORT");
        short miShort = 32000;
        System.out.println("valor de tipo short " + miShort);
        System.out.println("valor maximo soportado " + Short.MAX_VALUE );
        System.out.println("valor minimo soportado " + Short.MIN_VALUE ); // clases wrapper

        System.out.println("LONG");
        long miLong = 3200000000000000L;
        System.out.println("valor de tipo long " + miLong);
        System.out.println("valor maximo soportado " + Long.MAX_VALUE );
        System.out.println("valor minimo soportado " + Long.MIN_VALUE ); // clases wrapper

        System.out.println("FLOAT");
        float miFloat = 32.00000000f;
        System.out.println("valor de tipo float " + miLong);
        System.out.println("valor maximo soportado " + Float.MAX_VALUE );
        System.out.println("valor minimo soportado " + Float.MIN_VALUE ); // clases wrapper

        // constantes. PI = 3.1415
        // constantes. MI_PI = 3.1415
        // variables. camel case  miVariable = 33
        // int numeroParaCalcularElPeso = 45 + 67
    }
}
