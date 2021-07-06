/*Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.*/
import java.util.Scanner;
public class ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean validacion = true;
        System.out.println();

        while (validacion){
            System.out.println("Ingrese valor Player1:\n-(P)Piedra\n-(L)Papel\n(T)Tijera");
            String player1 = entrada.nextLine();
            System.out.println("Ingrese valor Player2:\n-(P)Piedra\n-(L)Papel\n(T)Tijera");
            String player2 = entrada.nextLine();
            if(player1.equalsIgnoreCase(player2)){
                System.out.println("Empate");
            }else if(player1.equalsIgnoreCase("P") && player2.equalsIgnoreCase("T")){
                System.out.println("Player 1 Win");
            }else if(player1.equalsIgnoreCase("L") && player2.equalsIgnoreCase("P")){
                System.out.println("Player 1 Win");
            }else if(player1.equalsIgnoreCase("T") && player2.equalsIgnoreCase("L")){
                System.out.println("Player 1 Win");
            }else{
                System.out.println("Player 2 Win");
            }
            System.out.println("¿Desea Continuar? y/n: ");
            String continuar = entrada.nextLine();
            if(continuar.equalsIgnoreCase("n")){
                validacion = false;
            }            
        }
        System.out.println("Salió del programa con exito");
        entrada.close();

    }
    
}
