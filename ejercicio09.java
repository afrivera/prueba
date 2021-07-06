/*Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más*/
import java.util.Scanner;
public class ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Por favor ingrese su edad: ");
        int edad = entrada.nextInt();
        
        if(edad<16){
            System.out.println("No tiene edad para trabajar.");
        }else if(edad>=19 && edad<=50){
            System.out.println("Por favor ingrese su Salario: ");
            float salario = entrada.nextFloat();
            System.out.println("su salario es: $" + (salario + salario * 0.05));
        }else if(edad>=51 && edad<=60){
            System.out.println("Por favor ingrese su Salario: ");
            float salario = entrada.nextFloat();
            System.out.println("su salario es: $" + (salario +salario * 0.10));
        }else if(edad>=19 && edad<=50){
            System.out.println("Por favor ingrese su Salario: ");
            float salario = entrada.nextFloat();
            System.out.println("su salario es: $" + (salario +salario * 0.05));
        }else if(edad>60){
            System.out.println("Por favor ingrese su Salario: ");
            float salario = entrada.nextFloat();
            System.out.println("su salario es: $" + (salario * 0.15));
        }else{
            System.out.println("que edad tienes viejo?");
        }
        entrada.close();
    }
    
}
