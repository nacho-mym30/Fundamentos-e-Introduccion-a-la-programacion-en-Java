import java.util.Scanner;

public class Carne{
    public int carneBlanda(int blanda){
        return blanda;
    }
    
    public int cantKilos(int kilos){
        return kilos;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del kilo de la carne blanda:");
        int blanda = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de kilos a comprar: ");
        int kilos = sc.nextInt();
        
        System.out.println("¿Cuánto de dinero necesitamos para comprar " + kilos + " kilos de carne blanda?");
        Carne c = new Carne();
        int resultado = c.carneBlanda(blanda) * c.cantKilos(kilos);
        
        System.out.println("Hay que llevar " + resultado + "Bs");
        sc.close();
    }
}
