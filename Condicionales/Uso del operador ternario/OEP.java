public class OEP{
    public String verificar (Persona persona){
        int edadPersona = persona.getEdad();
        String nombrePersona = persona.getNombre();
        String resp = nombrePersona;
        resp = edadPersona >= 18? resp + " Esta habilitada" : resp + " No esta habilitada"; 
        return resp;
    }
}