public class Robot2{
    private int energia;
    
    public Robot2(){
        energia = 0;
    }
    
    public int cantEneGas(int perimetro, int cantVueltas){
        int enerGas = energia;
        int nVuelta = 1;
        for(int i = 0; i < cantVueltas; i++){
            enerGas = enerGas + (perimetro * nVuelta);
            nVuelta = nVuelta + 1;
        }
        return enerGas;
    }
}