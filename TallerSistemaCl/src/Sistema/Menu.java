/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Accion.EnviarCorreo;

/**
 *
 * @author Usuario
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnviarCorreo mail = new EnviarCorreo("ridacevallos@espol.edu.ec", "Probar correo", "Estoy probando el envio del correo", 0);
        mail.ejecutarEnviarCorreo();
    }
    
}
