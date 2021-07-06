/*Muestra la serie de fibonacci hasta un número pedido por teclado. Por
ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
1, 2, 3, 5, 8, 13, 21, 34, 55, 89.*/
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero limite para imprimir el fibonacci: ");
        int num = entrada.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int resultado;
        System.out.print(fibo1 +", ");
        System.out.print(fibo2 +", ");
        while (fibo2 + fibo1 < num){
            resultado = fibo1 ;                       
            fibo1 = fibo2;  
            fibo2 = resultado + fibo1;               
            System.out.print(fibo2+ ", ");        
        }
        entrada.close();
    }
    
}
