package br.edu.ifba.rn;

import br.edu.ifba.basicas.Funcionario;

public class CadastroFuncionario {
	
	Funcionario[] func = new Funcionario[5];
	
	int cont = 0;
	
	public void cadastrarFuncionario(Funcionario f) {
		
		func[cont] = f;
		
		cont++;
		
	}
	
	
	public Funcionario[] listar() {
		return func;
	}

}
