package AgenciaBancaria;

import AgenciaBancaria.Cliente.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, double saldo, Banco banco, Integer agencia) {
		super(cliente, saldo, banco, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato AgenciaBancaria.Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	
}
