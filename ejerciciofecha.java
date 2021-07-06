/*Programa que pida por teclado la fecha de nacimiento de una persona
(día, mes, año) y calcule su número de la
El número de la suerte se calcula sumando el día, mes y año de la fecha
de nacimiento y a continuación sumando las cifras obtenidas en la suma.*/
import java.util.Scanner;
public class ejerciciofecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*System.out.println("Ingrese la fecha de nacimiento tal como muestra el ejemplo: 12/07/1980: ");
        String fecha = entrada.nextLine();//.replace("/", "");
        String[]cadena = fecha.split("/");
        int suma = 0;
        for (int i = 0; i<cadena.length;i++){
            int val1 = Integer.parseInt(cadena[i]);
            suma +=val1;        
        }
        int acumulado =0;
        System.out.println(suma);
        while(suma!=0){
            
            acumulado +=suma%10;
            suma /=10;
        }
        System.out.println(acumulado);*/
        int n = entrada.nextInt();
        int m = entrada.nextInt();
        for(int i = 0; i<m;i++){
            n /=10;
        }
        System.out.println(n);

        
        entrada.close();
        
    }
    
}
