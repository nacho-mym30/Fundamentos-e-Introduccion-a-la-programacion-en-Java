public class Insomnio{
    public int calcTiempo(){
        int hrDormir = 2 * 60 + 45;
        int hrDespertar = 11 * 60 + 25;
        int tiempoTotal = hrDespertar - hrDormir;
        return tiempoTotal;
    }
}

