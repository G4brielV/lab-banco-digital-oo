package AgenciaBancaria;

import AgenciaBancaria.Cliente.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, double saldo, Banco banco, Integer agencia) {
		super(cliente, saldo, banco, agencia);
	}

	public void renderJuros() {
		this.saldo *= 1.02; // 2% de juros
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato AgenciaBancaria.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
