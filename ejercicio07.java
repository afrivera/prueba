/*Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar.*/
import java.util.Scanner;
public class ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese un numero: ");
        int valNumero = entrada.nextInt();
        //String validacion = 
        boolean esPrimo = true;
        if (valNumero ==0||valNumero==1||valNumero==4 || valNumero<=2){
            esPrimo =false;
        }
        for (int x=2; x<valNumero/2; x++){
            if(valNumero%x==0){
                esPrimo = false;
            }
        }
        System.out.println("el numero " + valNumero + " es primo?: " + esPrimo);

        

        entrada.close();
    }
}
  /*  public static boolean primoEs(int numero){
        boolean validacion = true;
        
            }
        return validacion;  
            
        }*/
   
