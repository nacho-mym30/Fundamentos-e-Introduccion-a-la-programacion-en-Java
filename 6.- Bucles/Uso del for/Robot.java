public class Robot{
    private int energiaMax, energia;
    
    public Robot(int energiaMax){
        this.energiaMax = energiaMax;
        energia = 0;
    }
    
    public void cargarEnergia(){
        energia = energiaMax;
    }
    
    public int cantVueltas(int perimetro){
        int vueltas = 0;
        for(int energiaNece = perimetro; energia >= energiaNece; energiaNece += perimetro){
            energia -= energiaNece;
            vueltas++;
        }
        return vueltas;
    }
}