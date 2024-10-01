package PaqueteMedelynCajbón;

import java.util.Scanner;

public class ClaseMultiplicaciòn {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float numero1 = 0;
        float numero2 = 0;
        float resultado = 0;
        String opcion;
        
        do {
            System.out.print("Ingrese el primer número: ");
            numero1 = leer.nextFloat();
            System.out.print("Ingrese el segundo número: ");
            numero2 = leer.nextFloat();
        
            resultado =  numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
            System.out.println("\n");
            System.out.println("Desea realizar otra operación (S/N)");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("N"));
    }
}






