public class DiaSemSwitch{
    public String diaSemana(int n){
        String resp;
        switch(n){
            case 1 : resp = "Lunes"; break;
            case 2 : resp = "Martes"; break;
            case 3 : resp = "Miercoles"; break;
            case 4 : resp = "Jueves"; break;
            case 5 : resp = "Viernes"; break;
            case 6 : resp = "Sabado"; break;
            case 7 : resp = "Domingo"; break;
            default : resp = "No existe";
        }
        return resp;
    }
}