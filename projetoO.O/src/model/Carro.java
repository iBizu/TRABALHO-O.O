package model;

public class Carro {
	
	private String marca;
	private int ano_fabricacao;
	private int ano_modelo;
	private float quilometragem;
	private float combustivel;
	
	
	
	public Carro() {
		
	}
	
	
	public Carro(String marca, int ano_fabricaçao, int ano_modelo, float quilometragem, float combustivel) {
		this.marca = marca;
		this.ano_fabricacao = ano_fabricaçao;
		this.ano_modelo = ano_modelo;
		this.quilometragem = quilometragem;
		this.combustivel = combustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno_fabricaçao() {
		return ano_fabricacao;
	}
	public void setAno_fabricaçao(int ano_fabricaçao) {
		this.ano_fabricacao = ano_fabricaçao;
	}
	public int getAno_modelo() {
		return ano_modelo;
	}
	public void setAno_modelo(int ano_modelo) {
		this.ano_modelo = ano_modelo;
	}
	public float getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}
	public float getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}


	@Override
	public String toString() {
		return "Marca: " + marca + ", Ano de Fabricação: " + ano_fabricacao + ", Ano Modelo: " + ano_modelo
				+ ", Quilometragem: " + quilometragem + ", Combustível: "+combustivel;
	}


	
	
	
	
	

}
