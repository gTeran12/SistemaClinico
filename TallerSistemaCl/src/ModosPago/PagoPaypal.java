package ModosPago;

public class PagoPaypal implements Pago
{
    protected float monto;
    protected String email;
    
    @Override
    public boolean realizarPago(float monto) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
