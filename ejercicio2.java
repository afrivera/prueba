/*Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.*/
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor Ingrese el Nombre del Alumno: ");
        String nomAlumno = entrada.nextLine();
        float promedio = 0;
        for(int i = 1; i<=3;i++){        
            System.out.println("Por favor Ingrese la nota de la evaluación n°"+i);
            float notaEvaluacion = entrada.nextFloat();
            promedio += notaEvaluacion;
        }
        
        promedio= promedio /3;
        System.out.println("El estado del Alumno " + nomAlumno+  " Con el promedio " + promedio + " es "+ (promedio>=3? "Aprobado":"Reprobado"));
        entrada.close();
    }
    
}
