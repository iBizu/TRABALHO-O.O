package model;

public class Cliente extends Pessoa {

	private long orcamento;
	
	public Cliente(String nome, String numero_telefone, String cpf,long orcamento, Carro carro) {
		super(nome, numero_telefone, cpf, carro);
		this.orcamento = orcamento;
		}

	public Cliente() {
	        super();
	    }
	
	public long getorcamento() {
	        return orcamento;
	    }

	public void setorcamento(long orcamento) {
	        this.orcamento = orcamento;
	    }
	
	@Override
	public String toString() {
		return super.toString()+"\nOrçamento: "+orcamento+ ""; 
	    }
	
	    
}
