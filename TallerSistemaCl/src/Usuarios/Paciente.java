package Usuarios;

import Accion.EnviarCorreo;
import Datos.Cita;
import Datos.HistoriaClinica;
import Datos.Receta;
import java.util.ArrayList;
import java.util.Date;

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
        cita= new Cita();  
        cita.setFecha(new Date());
        cita.setPagada(true);
        cita.setRegistradoPor("Juan Piguave");
        cita.setPaciente(this);
        cita.setDoctor(new Doctor());
        
        EnviarCorreo mail = new EnviarCorreo("bsegovia@espol.edu.ec", "Confirmacion de Cita", "Fecha: "+ cita.getFecha().toString()
                + "\nRegistrada Por: "+ cita.getRegistradoPor()+ "\nPaciente: "+ this.nombre +" "+this.apellido
                + "\nDoctor: " +cita.getDoctor().apellido, 0);
        mail.ejecutarEnviarCorreo();
        System.out.println("Se ha enviado la confirmacion de la cita a su correo electronico");
        return true;
        
    }
}
