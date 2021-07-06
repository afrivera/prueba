public class Clase1 {
    public static void main(String[] args) {
        var nombre = "Andres Rivera";
        var resultado = saludo(nombre);
        System.out.println(resultado);
               
    }
    public static String saludo(String nombre) {
        return "Hola " + nombre+ "!";
        
    }
    
}
