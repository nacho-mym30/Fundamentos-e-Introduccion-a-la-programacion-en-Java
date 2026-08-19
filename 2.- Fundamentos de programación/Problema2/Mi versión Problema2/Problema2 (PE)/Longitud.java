import java.util.Scanner;

public class Longitud{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la línea punteada: ");
        int lineaPunteada = sc.nextInt();
        System.out.println();
        
        System.out.println("¿Cuánto seria la longitud de la línea negra?"); 
        int lineaNegra = sc.nextInt();
        int resultado = lineaNegra * lineaPunteada;
        System.out.println();
        
        System.out.println("La línea negra mide " + resultado);
    }
}
