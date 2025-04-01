package AgenciaBancaria;

import AgenciaBancaria.Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private final List<Conta> contas = new ArrayList<>();

	protected void adicionarConta(Conta conta){
		this.contas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}


}
