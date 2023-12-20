package model;

import java.util.ArrayList;

public abstract class Pessoa {
	
	protected String nome;
    protected String numero_telefone;
    protected String cpf;
    protected ArrayList<Carro> Carro= new ArrayList<Carro>();

   public Pessoa(String nome, String numero_telefone, String cpf, Carro carro) {
		this.nome = nome;
		this.numero_telefone = numero_telefone;
		this.cpf = cpf;
		Carro.add(carro);
	}

	public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

	@Override
	public String toString() {
		return "Nome:" + nome + "\nNumero telefone:" + numero_telefone + "\nCPF:" + cpf + "\n"+Carro.toString();
	}
	
}
