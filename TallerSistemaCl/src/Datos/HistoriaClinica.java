package Datos;

import java.util.ArrayList;

public class HistoriaClinica 
{
    protected int numero;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;

    public HistoriaClinica(int numero, ArrayList<String> enfermedades, ArrayList<String> alergias, ArrayList<String> otros) 
    {
        this.numero = numero;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }
}
