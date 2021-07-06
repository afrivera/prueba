import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) throws IOException{
        SolicitarDatos();
    }


    public static void SolicitarDatos() throws IOException{
        /*
        var input = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        var nombre = input.nextLine();
        System.out.println("Hola " + nombre + "!");
        input.close();
        */
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Por favor ingrese su nombre");
        String nombre = br.readLine();
        System.out.println("Hola " + nombre + "!");
    }

}
