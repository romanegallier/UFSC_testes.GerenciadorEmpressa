package test.gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Fonctionario> fonctionario;
	private List<Projeto> projeto;
	

	public Empresa() {
		this.fonctionario=new ArrayList<Fonctionario>();
		this.projeto=new ArrayList<Projeto>();
	}
	
	public void addFontionario(Fonctionario fonctionario) {
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
