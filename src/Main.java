import AgenciaBancaria.*;
import AgenciaBancaria.Cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();

		Cliente venilton = new Cliente("Venilton");
		Cliente jorge = new Cliente("Jorge");

		Conta ccVeni = new ContaCorrente(venilton,100, banco, null);
		Conta poupancaVeni = new ContaPoupanca(venilton, 200, banco, null);
		Conta ccJor = new ContaCorrente(jorge, 10000, banco, 99);

		System.out.println(banco.getContas());

		ccVeni.depositar(100);
		ccVeni.transferir(100, poupancaVeni);

		ccVeni.imprimirExtrato();
		poupancaVeni.imprimirExtrato();
		ccJor.imprimirExtrato();
	}
}
