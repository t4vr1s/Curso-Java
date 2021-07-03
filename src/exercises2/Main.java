package exercises2;

public class Main {
    public static void main(String[] args) {
        // Obtener el descuento de un producto teniendo el nombre del producto, clave y precio original.
        // El descuento lo hace en base a la clave. Si la clave es 01,
        // El descuento es el 10% y si la clave es 02 el descuento es un 20%(sólo existen 2 claves)
        // mostrar datos y descuentos si lo obtiene.
        String prod1 = "arroz";
        String prod2 = "fideos";
        int cod1= 01;
        int cod2= 02;
        int precio1= 400;
        int precio2 =800;
        double porce10 = precio1 * 0.1;
        double porce20 = precio1 * 0.2;

        if( cod1== 01){
            System.out.println("el precio del " + prod1  +" es $"+ precio1 + " y  con descuento del 10% es : " +  (precio1 - porce10)  );
        }

        if( cod2== 02){
            System.out.println("el precio del " + prod1  +" es $" +  precio1+" y  con descuento  del 20% es : " +  (precio1 - porce20));
        }

        if( cod1== 01){
            System.out.println("el precio del " + prod2  +" es $"+ precio2 + " y  con descuento del 10% es : " +  (precio2 - porce10)  );
        }
        if( cod2== 02){
            System.out.println("el precio del " + prod2  +" es $"+ precio2 + " y  con descuento del 10% es : " +  (precio2 - porce20)  );
        }
    }
}
