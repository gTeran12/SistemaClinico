package Usuarios;

import java.util.Date;

public class Persona 
{
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    protected Administrador admin;
    
    public boolean logIn()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean logOut()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
}
