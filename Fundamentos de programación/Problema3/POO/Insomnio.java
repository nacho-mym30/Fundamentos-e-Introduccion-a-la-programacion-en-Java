public class Insomnio{
    private int hrDormir;
    private int hrDespertar;
    
    public Insomnio(int dormir, int minDormir, int despertar, int minDespertar){
        this.hrDormir = (dormir * 60) + minDormir;
        this.hrDespertar = (despertar * 60) + minDespertar;
    }
    
    public int calcTiempo(){
        int resultado = hrDespertar - hrDormir;
        return resultado;
    }
}