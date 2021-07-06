/*Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
       
        System.out.println("Digite el numero 1: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite el numero 2: ");
        int num2 = entrada.nextInt();
        int suma = num1 + num2;
        int resta = num1- num2;        
        int multiplica = num1 *num2;
        System.out.println("La suma de " + num1 + " y " + num2 +" es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 +" es: "+ resta);
        System.out.println("La multiplicacion" + num1 + " y " + num2 +" es: " + multiplica);

        try{
            float division = num1 / num2;
            System.out.println("La division de "+ num1 + " y " + num2 +" es: " + division);
            
        }catch(Exception e){
            System.out.println("no es posible dividir entre 0");
        }
        entrada.close();
    }
}
