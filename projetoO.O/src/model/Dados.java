package model;

import java.util.ArrayList;

public class Dados {
	
	private ArrayList<Cliente> ClientesCadastrados = new ArrayList<Cliente>();
	private ArrayList<Mecanico> MecanicosCadastrados = new ArrayList<Mecanico>();
	
	public ArrayList<Cliente> getClientesCadastrados() {
		return ClientesCadastrados;
	}
	public void setClientesCadastrados(ArrayList<Cliente> clientesCadastrados) {
		ClientesCadastrados = clientesCadastrados;
	}
	public ArrayList<Mecanico> getMecanicosCadastrados() {
		return MecanicosCadastrados;
	}
	public void setMecanicosCadastrados(ArrayList<Mecanico> mecanicosCadastrados) {
		MecanicosCadastrados = mecanicosCadastrados;
	}
	
	}
