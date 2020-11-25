package Usuarios;

import Adicional.AreaMedica;
import Datos.Cita;
import java.util.ArrayList;

public class Doctor extends Persona 
{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected ArrayList<Cita> citasPendientes;
    protected AreaMedica area;
    
    public void recetar()
    {
        
    }
    
    public void agregarPlanNut()
    {
        
    }
    
    public void imprimirReceta()
    {
            
    }
    
    public void registrarSecretaria(Secretaria secretaria)
    {
        
    }

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public ArrayList<Cita> getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
        this.citasPendientes = citasPendientes;
    }

    public AreaMedica getArea() {
        return area;
    }

    public void setArea(AreaMedica area) {
        this.area = area;
    }
}
