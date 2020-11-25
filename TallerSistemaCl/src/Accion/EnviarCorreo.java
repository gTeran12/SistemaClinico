/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accion;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
/**
 *
 * @author guill
 */
public class EnviarCorreo {
    private final long initialTime;
    private final String remitente = "gruponumeroocho8@gmail.com";
    private final String clave = "grupoOcho.8";
    //Se establece el servido SMTP
    private final String servidorSmtp = "smtp.gmail.com";
    private final String puertoEnvio =  "465";
    private String mailReceptor = null;
    private String asunto = null;
    private String cuerpo = null;

    
    public EnviarCorreo(String mailReceptor, String asunto, String cuerpo, long initialTime){
        this.mailReceptor = mailReceptor;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.initialTime = initialTime;
    }
    

    public void ejecutarEnviarCorreo(){
        Properties props = new Properties();
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.host", servidorSmtp);
        props.put("mail.smtp.port", puertoEnvio);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", puertoEnvio);
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();
        //Se captura las excepciones
        try {
            Authenticator auth = new autentificadorSMTP();
                    
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            
            MimeMessage msg = new MimeMessage(session);
            
            msg.setText(cuerpo);
            
            msg.setSubject(asunto);
            
            msg.setFrom(new InternetAddress(remitente));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
                    mailReceptor));
            Transport.send(msg);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        
        //System.out.println(mailReceptor + " " + asunto + " " +(System.currentTimeMillis() - this.initialTime)/1000 +"seg");
        
    }
    
    private class autentificadorSMTP extends javax.mail.Authenticator {
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(remitente, clave);
        }
    }
    
    
}
