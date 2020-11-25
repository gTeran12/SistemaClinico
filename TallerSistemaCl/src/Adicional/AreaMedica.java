package Adicional;

import Usuarios.Doctor;
import java.util.ArrayList;

public class AreaMedica 
{
    protected String especialidad;
    protected float costo;
    protected ArrayList<Doctor> doctores;

    public AreaMedica()
    {
        
    }
    
    public AreaMedica(String especialidad, float costo) 
    {
        this.especialidad = especialidad;
        this.costo = costo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }
    
    
}
