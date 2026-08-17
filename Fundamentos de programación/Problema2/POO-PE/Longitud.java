import java.util.Scanner;

public class Longitud{
    private int punteada;
    
    public Longitud(int punteada){
        this.punteada = punteada;
    }
    
    public int lineaPunteada(){
        return punteada;
    }
    
    public int lineaNegra(int negra){
        int resultado = negra * lineaPunteada();
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la línea punteada: ");
        int punteada = sc.nextInt();
        
        System.out.println("¿Cuánto es la longitud de la línea negra?");
        int negra = sc.nextInt();
        Longitud l = new Longitud(punteada);
        int resultado = l.lineaNegra(negra);
        
        System.out.println("La longitud de la línea punteada es: " + resultado);
        sc.close();
    }
}
