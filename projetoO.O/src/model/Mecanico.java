package model;

public class Mecanico extends Pessoa {
    
	private double salario;

    public Mecanico(String nome, String numero_telefone, String cpf, double salario, Carro carro){
        super(nome, numero_telefone, cpf, carro);
        this.salario = salario;
    }
    
    public Mecanico() {
    	super();
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
	public String toString() {
		return super.toString() +"\nSalário: " + this.getSalario();
	    }

}
