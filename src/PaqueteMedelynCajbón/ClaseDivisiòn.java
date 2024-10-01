package PaqueteMedelynCajbón;   
import java.util.Scanner;

public class ClaseDivisiòn  {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        realizarDivision();
    }

    public static void realizarDivision() {
        int numero1, numero2;
        float resultado;

        System.out.print("Ingrese el primer número: ");
        numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = leer.nextInt();

        if (numero2 == 0) {
            System.out.println("No se puede dividir por 0, por favor ingrese un número válido.");
            realizarDivision(); 
        } else {
            resultado =  (float) numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}

