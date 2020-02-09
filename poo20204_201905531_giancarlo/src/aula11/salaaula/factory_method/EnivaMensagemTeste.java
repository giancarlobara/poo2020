package aula11.salaaula.factory_method;

public class EnivaMensagemTeste {
    public static void main(String[] args) {
        String mensagem = "Testando o envio de mensagens.";
        Emissor emissor;

        //enviando por sms
        emissor = new EmissorCreator().create("SMS");
        emissor.envia(mensagem);

        //enviando por sms
        emissor = new EmissorCreator().create("JMS");
        emissor.envia(mensagem);

        //enviando por sms
        emissor = new EmissorCreator().create("EMAIL");
        emissor.envia(mensagem);

        //tentando outro tipo
        try {
            emissor = new EmissorCreator().create("SEND");
            emissor.envia(mensagem);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
