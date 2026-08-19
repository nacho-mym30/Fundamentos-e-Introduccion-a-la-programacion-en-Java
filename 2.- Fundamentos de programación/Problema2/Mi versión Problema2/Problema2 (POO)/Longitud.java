public class Longitud{
    private int lineaPunteada;
    
    public Longitud(int punteada){
        this.lineaPunteada = punteada;
    }
    
    public int longNegra(int lineaNegra){
        int resultado = lineaNegra * lineaPunteada;
        return resultado;
    }
}
