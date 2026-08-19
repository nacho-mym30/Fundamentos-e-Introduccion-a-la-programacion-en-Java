public class Robot{
    private int energiaMax, energia;
    
    public Robot(int energiaMax){
        this.energiaMax = energiaMax;
        energia = 0;
    }
    
    public void cargarEenergia(){
        energia = energiaMax;
    }
    
    public int cantVueltas(int perimetro){
        int vueltas = 0;
        int energiaNece = perimetro;
        while(energia >= energiaNece){
            energia = energia - energiaNece;
            vueltas++;
            energiaNece = energiaNece + perimetro;
        }
        return vueltas;
    }
}
