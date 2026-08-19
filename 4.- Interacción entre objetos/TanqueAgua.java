public class TanqueAgua{
    private int capacidad, cantAgua;
    
    public TanqueAgua(){
        capacidad = 950;
        cantAgua = 0;
    }
    
    public int cantTurriNece(){
        int resp = capacidad / 210;
        return resp;
    }
    
    public int getCantAgua(){
        return cantAgua;
    }
    
    public void setCapacidad(int nCapacidad){
        capacidad = nCapacidad;
    }
    
    public void setCantAgua(int nCantAgua){
        cantAgua = nCantAgua;
    }
}
