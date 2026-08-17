import java.util.Scanner;

public class Insomnio{
    public int hrDormir(int horaDor, int minDor){
        int resultado = (horaDor * 60) + minDor;
        return resultado;
    }
    
    public int hrDespertar(int horaDes, int minDes){
        int resultado = (horaDes * 60) + minDes;
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Insomnio i = new Insomnio();
        System.out.println("Ingrese la hora a la que durmio: ");
        int horaDor = sc.nextInt();
        int minDor = sc.nextInt();
        int resDor = i.hrDormir(horaDor, minDor);
        System.out.println("Trasnformado en minutos es: " + resDor + "\n");
        
        System.out.println("Ingrese la hora a la que desperto: ");
        int horaDes = sc.nextInt();
        int minDes = sc.nextInt();
        int resDes = i.hrDespertar(horaDes, minDes);
        System.out.println("Trasnformado en minutos es: " + resDes + "\n");
        
        System.out.println("¿Cuánto tiempo durmio? \n");
        int tiempo = resDes - resDor;
        System.out.println("Durmio " + tiempo + " minutos en total");
        sc.close();
    }
}