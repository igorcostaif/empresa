package br.edu.ifba.rn;

import br.edu.ifba.basicas.Empresa;

public class CadastroEmpresa {
	
	
	Empresa[] em = new Empresa[5];
	
	int cont = 0;
	
	public void cadastrarEmpresa(Empresa empresa) {
		
		if(cont<em.length) {
			em[cont] = empresa;
			cont++;
		}else {
			System.out.println("Vetor cheio!!");
		}
		
		
	}
	
	
	public Empresa[] listarEmpresas() {
		return em;
	}
	

}
