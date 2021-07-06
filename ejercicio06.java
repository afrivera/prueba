/*Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110*/
import java.util.Scanner;
public class ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor Ingrese M si es Mujer o H si es Hombre: ");
        String sexo = entrada.nextLine().toUpperCase();
        System.out.println("Por favor ingrese su altura en cm: ");
        int altura = entrada.nextInt();
        if (sexo.equals("M")){
            System.out.println("su peso ideal es: " + (altura - 110));
        }else if(sexo.equals("F")){
            System.out.println("su peso ideal es: " + (altura - 120));
        }else{
            System.out.println("que sexo tienes viejo?");
        }
        entrada.close();

    }

}
