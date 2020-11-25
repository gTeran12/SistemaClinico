package ModosPago;

public class PagoEfectivo implements Pago 
{
    protected float monto;
    
    @Override
    public boolean realizarPago(float monto) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
