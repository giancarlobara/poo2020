package aula11.salaaula.factory_method;

public class EmissorSMS implements Emissor {
    public void envia(String mensagem) {
        System.out.println(" Enviando por SMS a mensagem : ");
        System.out.println(mensagem);
    }
}
