
package PaqueteMedelynCajbón;

import java.util.Scanner;

public class ClaseResta {
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        
        for (int i = 1; i < 5; i++) {
       
        float numero1 = 0;
        float numero2 = 0;
        float resultado = 0;
         
        System.out.print("Ingrese el primer número: ");
        numero1 = leer.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        numero2 = leer.nextFloat();
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);   
        } 
  }
}
