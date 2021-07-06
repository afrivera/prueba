/*Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.*/
import java.util.Scanner;
public class ejercicio04{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la tabla de multiplicar que desea imprimir: ");
        int numtabla = entrada.nextInt();
        for (int i = 1; i<=10; i++){
            int multiplica = numtabla * i;
            System.out.println(numtabla + " x " + i + " = " + multiplica );
        }
        entrada.close();        
    }
}