import java.util.Scanner;

public class Carne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int carneBlanda = sc.nextInt();
        int carneNormal = sc.nextInt();
        int cantKilos = sc.nextInt();
        
        int resultado = carneBlanda * cantKilos;
        
        System.out.println(resultado);
    }
}
