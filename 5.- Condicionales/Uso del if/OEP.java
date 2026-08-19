public class OEP{
    public String verificar (Persona persona){
        String resp;
        int edadPersona = persona.getEdad();
        String nombrePersona = persona.getNombre();
        if(edadPersona >= 18){
            resp = nombrePersona + " Esta habilitada";
        } else {
            resp = nombrePersona + " No esta habilitada";
        }
        return resp;
    }
}
