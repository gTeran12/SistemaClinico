package Usuarios;

import Datos.Cita;
import Datos.HistoriaClinica;
import Datos.Receta;
import java.util.ArrayList;

public class Paciente extends Persona
{
    protected String email;
    protected HistoriaClinica historia;
    protected Cita cita;
    protected ArrayList<Receta> recetas;
    
    public Paciente(int numeroHistoria, ArrayList<String> enfermedades, ArrayList<String> alergias, ArrayList<String> otros, String email)
    {
        historia = new HistoriaClinica(numeroHistoria, enfermedades, alergias, otros);
        this.email = email;
        recetas = new ArrayList<>();
    }
    
    public boolean solicitarCita()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
