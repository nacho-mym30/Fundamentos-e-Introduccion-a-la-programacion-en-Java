public class DiasSemana{
    public String diaSemana(int n){
        String resp;
        if(n == 1){
            resp = "Lunes";
        } else if(n == 2){
            resp = "Martes";
        } else if(n == 3){
            resp = "Miercoles";
        } else if(n == 4){
            resp = "Jueves";
        } else if(n == 5){
            resp = "Viernes";
        } else if(n == 6){
            resp = "Sabado";
        } else if(n == 7){
            resp = "Domingo";
        } else {
            resp = "No existe";
        }
        return resp;
    }
}

