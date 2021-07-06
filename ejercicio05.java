/*Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio.*/
import java.util.Scanner;
public class ejercicio05 {
    public static void main(String[] args) {
        double adivinaNum = Math.floor(Math.random()*101);
        int numRandom = (int) adivinaNum;
        System.out.println(numRandom);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor adivine el numero que estoy pensando, lo anotaré por ahí: ");
        int numDigitado = entrada.nextInt();        
        while (numRandom != numDigitado){            
            System.out.println(numRandom>numDigitado?"El número que busca es mayor" : "El número que busca es menor");
            System.out.println("Adivine el numero: ");
            numDigitado = entrada.nextInt();
        }
        System.out.println("Felicidades Adivinaste el Numero");
        entrada.close();
        
    }
    
}
