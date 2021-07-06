import java.util.Scanner;

public class Clase02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        var numero = sc.nextInt();

        var digitos = numeroDigitos(numero);
        System.out.println("el numero tien: " + digitos + " cifras");
              
        
    }
    public static int numeroDigitos(int numero) {
        var cifras = 0;
        while (numero!=0){
            numero /=10;
            cifras++;

        }
        return cifras;
        
    }
   
        
    }
    
    

