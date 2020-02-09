package aula11.salaaula.factory_method;

public class EmissorCreator {

    public Emissor create ( String tipoDeEmissor ) {
        if(tipoDeEmissor.equalsIgnoreCase("SMS")) {
            return new EmissorSMS();
        }else if(tipoDeEmissor.equalsIgnoreCase("EMAIL")) {
            return new EmissorEmail();
        } else if (tipoDeEmissor.equalsIgnoreCase("JMS")) {
            return new EmissorJMS();
        } else {
            throw new IllegalArgumentException ("Tipo de emissor não suportado");
        }
    }

}
