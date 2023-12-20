package controller;

import java.util.Scanner;
import model.*;


public class Operator {

	public static void main(String[] args) {
		
		Dados dados = new Dados();
		Scanner n = new Scanner(System.in);
		int aux = 0;
		
		while (aux!=5) {
		System.out.println("Selecione uma opção: \n1-Cadastro do Cliente\n2-Visualizar os Clientes\n3-Cadastro do Mecânico\n4-Visualizar Mecânico\n5-Sair");	
		aux = n.nextInt();
			
		switch(aux) {
		case 1: 
			System.out.println("NOME: ");
			String nomeCliente = n.next();
			System.out.println("TELEFONE: ");
			String numCliente = n.next();
			System.out.println("CPF: ");
			String cpfCliente = n.next();
			System.out.println("ORÇAMENTO: ");
			Long orcamento = n.nextLong();	
			System.out.println("MARCA DO CARRO: ");
			String marca = n.next();	
			System.out.println("ANO DE FABRICAÇÃO: ");
			int ano_fabricacao = n.nextInt();
			System.out.println("ANO DO MODELO: ");
		    int ano_modelo = n.nextInt();
		    System.out.println("QUILOMETRAGEM: ");
			float quilometragem = n.nextFloat();
			System.out.println("NÍVEL DE COMBUSTÍVEL : ");
			float combustivel = n.nextLong();	
			
			Carro carro = new Carro(marca,ano_fabricacao,ano_modelo,quilometragem,combustivel);			
			Cliente cliente = new Cliente(nomeCliente,numCliente,cpfCliente,orcamento,carro);
			dados.getClientesCadastrados().add(cliente);
			System.out.println("Cliente cadastrado com sucesso\n");		
			break;
		case 2: 
			for (int i=0;i<dados.getClientesCadastrados().size();i++) {
				System.out.println("\n"+ dados.getClientesCadastrados().get(i).toString()+"\n");			
			}
			break;
		case 3:
			System.out.println("NOME: ");
			String nomeMec = n.next();
			System.out.println("TELEFONE: ");
			String numMec = n.next();
			System.out.println("CPF: ");
			String cpfMec = n.next();
			System.out.println("SALÁRIO: ");
			double salario = n.nextDouble();
			System.out.println("MARCA DO CARRO: ");
			String marcaMec = n.next();	
			System.out.println("ANO DE FABRICAÇÃO: ");
			int ano_fabricacaoMec = n.nextInt();
			System.out.println("ANO DO MODELO: ");
		    int ano_modeloMec = n.nextInt();
		    System.out.println("QUILOMETRAGEM: ");
			float quilometragemMec = n.nextFloat();
			System.out.println("NÍVEL DE COMBUSTÍVEL : ");
			float combustivelMec = n.nextLong();	
			
			Carro carroMec = new Carro(marcaMec,ano_fabricacaoMec,ano_modeloMec,quilometragemMec,combustivelMec);	
			Mecanico mecanico = new Mecanico(nomeMec,numMec,cpfMec,salario,carroMec);
			dados.getMecanicosCadastrados().add(mecanico);
			System.out.println("Mecânico cadastrado com sucesso\n");	
			break;
		case 4:
			for (int i=0;i<dados.getMecanicosCadastrados().size();i++) {
				System.out.println("\n"+ dados.getMecanicosCadastrados().get(i).toString()+"\n");			
			};
			break;
		case 5:
			aux=5;
			break;
		}
		}
		n.close();
		System.out.println("Fim");
	}
}
