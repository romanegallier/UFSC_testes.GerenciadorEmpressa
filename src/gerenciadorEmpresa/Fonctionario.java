package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Fonctionario {

	List <Projeto> projetos;
	
	public Fonctionario() {
		projetos = new ArrayList<Projeto>();
	}

	public void addProjeto(Projeto projeto) {
		this.projetos.add(projeto);
	}

	public List<Projeto> getProjetos() {
		
		return this.projetos;
	}

}
