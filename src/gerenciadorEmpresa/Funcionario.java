package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	List <Projeto> projetos;
	
	public Funcionario() {
		projetos = new ArrayList<Projeto>();
	}

	public void addProjeto(Projeto projeto) {
		this.projetos.add(projeto);
	}

	public List<Projeto> getProjetos() {
		
		return this.projetos;
	}

}
