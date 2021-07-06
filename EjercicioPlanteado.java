import java.util.Scanner;
public class EjercicioPlanteado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var distancia= entrada.nextInt();
        float km = entrada.nextFloat();
        float resultado = distancia / km;
        

        System.out.printf("%.3f km/l",resultado);
        entrada.close();
        Integer valor = 1;

    }
    
}
