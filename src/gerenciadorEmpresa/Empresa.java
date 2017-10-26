package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Funcionario> fonctionario;
	private List<Projeto> projeto;
	

	public Empresa() {
		this.fonctionario=new ArrayList<Funcionario>();
		this.projeto=new ArrayList<Projeto>();
	}
	
	public void addFuncionario(Funcionario fonctionario) {
		this.fonctionario.add(fonctionario);
	}

	public Object getFonctionario(int i) {
		return fonctionario.get(i);
	}
	
	

	public void addProjeto(Projeto projeto) {
		this.projeto.add(projeto);
		
		
	}

	public Object getProjeto(int i) {
		
		return this.projeto.get(i);
	}
	
}
