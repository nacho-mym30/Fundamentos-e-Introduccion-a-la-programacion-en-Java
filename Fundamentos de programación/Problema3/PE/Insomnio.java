import java.util.Scanner;

public class Insomnio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora a la que duerme: ");
        int hrDormir = sc.nextInt();
        int minDormir = sc.nextInt();
        int resDormir = (hrDormir * 60) + minDormir;
        System.out.println("Trasnformado a minutos es: " + resDormir + "\n");
        
        System.out.println("Ingrese la hora a la que despierta: ");
        int hrDespertar = sc.nextInt();
        int minDespertar = sc.nextInt();
        int resDespertar = (hrDespertar * 60) + minDespertar;
        System.out.println("Trasnformado a minutos es: " + resDespertar + "\n");
        
        int tiempo = resDespertar - resDormir;
        System.out.println("Durmio " + tiempo + " minutos en total");
    }
}