
public class Main {

	public static void main(String[] args) {
		Cliente Ramon = new Cliente();
		Ramon.setNome("Ramon");
		
		Conta cc = new ContaCorrente(Ramon);
		Conta poupanca = new ContaPoupanca(Ramon);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}