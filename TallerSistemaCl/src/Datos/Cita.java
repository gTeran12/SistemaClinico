package Datos;

import ModosPago.Pago;
import Usuarios.Doctor;
import Usuarios.Paciente;
import java.util.Date;

public class Cita 
{
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;
    
    public boolean realizarPago(Pago pago)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
