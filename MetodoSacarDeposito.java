
public class MetodoSacarDeposito {

	public static void main(String[] args) {
		
		Conta conta= new Conta();
		conta.deposito(500);
		conta.deposito(500);
		conta.deposito(500);
		conta.deposito(500);
		conta.saque(500);
		conta.saque(555);
		
		conta.extratoConta();
		
	
			
		

	}

}
