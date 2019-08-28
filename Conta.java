
public class Conta {
	
	private String nome;
	private int saldoContaCorrente;
	private int limiteCredito;
	private StringBuilder extrato = new StringBuilder();
	public  void extratoConta() {
		System.out.println(extrato);
	}
	public void deposito(int valor) { 
		if ( valor >= 0) {
			saldoContaCorrente += valor;
			extrato.append("  Deposito R$").append(valor).append("\n");
			extrato.append("Saldo atual é").append(saldoContaCorrente).append("\n");
		}
			else {
				System.out.println("Deposito invalido");
			
			}
		}
		
	
	public void saque(int valor) {
	 if ( saldoContaCorrente + limiteCredito >= valor) {
		 saldoContaCorrente -= valor;
		 extrato.append("  Saque R$").append(valor).append("\n");
			extrato.append("Saldo atual é").append(saldoContaCorrente).append("\n");
	 }
	 else  {
			 System.out.println("Valor superior ao seu limite");
			 
			 
		 }
	 }
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		nome = nome;
	}



	public int getSaldoContaCorrente() {
		return saldoContaCorrente;
	}


	public int getLimiteCredito() {
		return limiteCredito;
	}



	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public static void main(String[] args) {
           
		
			
	}

}
