/*Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.*/
import java.util.Scanner;
public class ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese la cantidad de horas trabajadas: ");
        int horaTrabajo = entrada.nextInt();
        int pagotrabajo = horaTrabajo * 30000;
        System.out.println("El sueldo total es de: $" + pagotrabajo);
        entrada.close();

        
    }
    
}
