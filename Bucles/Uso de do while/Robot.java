public class Robot{
    private int energia;
    
    public Robot(){
        energia = 0;
    }
    
    public int cantEneGas(int perimetro, int cantVueltas){
        int enerGas = 0;
        int nVuelta = 1;
        int cont = 0;
        do{
            enerGas = enerGas + (perimetro * nVuelta);
            nVuelta++; // tambien podemos usar nVuelta = nVuelta + 1; o nVuelta += 1;
            cont++;
        } while(cont < cantVueltas);
        return enerGas;
    }
}