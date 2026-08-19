public class Carne{
    private int carneBlanda;
    private int carneNormal;
    
    public Carne(int blanda, int normal){
        this.carneBlanda = blanda;
        this.carneNormal = normal;
    }
    
    public int cantDinero(int cantKilos){
        int resultado = carneBlanda * cantKilos;
        return resultado;
    }
}
