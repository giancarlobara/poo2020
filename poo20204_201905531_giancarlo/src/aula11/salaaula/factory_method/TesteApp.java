package aula11.salaaula.factory_method;

public class TesteApp {

	public static void main(String[] args) {
		
		FabricaPessoa factory = new FabricaPessoa();
		
        factory.criaPessoa("Carlos", "M");
        
        factory.criaPessoa("Maria", "F");
        
        try {
            factory.criaPessoa("Erro", "Z");
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

}
