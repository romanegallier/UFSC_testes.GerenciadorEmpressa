package gerenciadorEmpresa;

public class Ocorrencia {
	Prioridades prioridades;
	String resumo;
	private Funcionario fonctionario;

	public Ocorrencia(Prioridades p, String string, Funcionario fonctionario) {
		this.prioridades=p;
		this.resumo=string;
		this.fonctionario=fonctionario;
		
	}

	public Object getPrioridade() {
		return prioridades;
	}

	public long getChave() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getResume() {
		
		return resumo;
	}

	public Funcionario getFonctionario() {
		return fonctionario;
	}

}
