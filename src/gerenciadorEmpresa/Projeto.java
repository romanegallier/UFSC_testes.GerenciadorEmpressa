package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	List<Ocorrencia> ocorrencias;
	private Funcionario responsavelDoProjeto;
	
	public Projeto() {
		this.ocorrencias = new ArrayList<Ocorrencia>();
	}	

	public void addOcorrencia(Ocorrencia ocurencia) {
		
		this.ocorrencias.add(ocurencia);
	}

	public Ocorrencia getOcorrencia(int i) {
		
		return this.ocorrencias.get(i);
	}

	public Funcionario getResponsavel() {
		return this.responsavelDoProjeto;
	}

	public void setResponsavel(Funcionario joao) {
		this.responsavelDoProjeto = joao;
	}

}
