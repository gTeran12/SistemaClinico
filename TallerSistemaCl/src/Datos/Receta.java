package Datos;

import Usuarios.Doctor;
import Usuarios.Paciente;
import java.util.Date;

public class Receta 
{
    protected Date fecha;
    protected PlanNutricional plan;
    protected Doctor doctor;
    protected Paciente paciente;
    
    public Receta()
    {
        
    }
    
    public Receta(Date fecha) 
    {
        this.fecha = fecha;
        plan = new PlanNutricional();
    }

    public Date getFecha() 
    {
        return fecha;
    }

    public void setFecha(Date fecha) 
    {
        this.fecha = fecha;
    }

    public PlanNutricional getPlan() 
    {
        return plan;
    }

    public void setPlan(PlanNutricional plan) 
    {
        this.plan = plan;
    }   
}
