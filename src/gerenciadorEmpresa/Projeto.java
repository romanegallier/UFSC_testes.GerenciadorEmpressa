package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	List<Ocurencia> ocorrencias;
	
	public Projeto() {
		this.ocorrencias = new ArrayList<Ocurencia>();
	}	

	public void addOcorrencia(Ocurencia ocurencia) {
		
		this.ocorrencias.add(ocurencia);
	}

	public Ocurencia getOcorrencia(int i) {
		
		return this.ocorrencias.get(i);
	}

}
