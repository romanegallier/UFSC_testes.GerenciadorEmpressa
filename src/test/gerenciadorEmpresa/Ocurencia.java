package test.gerenciadorEmpresa;

public class Ocurencia {
	Prioridades prioridades;
	String resumo;
	private Fonctionario fonctionario;

	public Ocurencia(Prioridades p, String string, Fonctionario fonctionario) {
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

	public Fonctionario getFonctionario() {
		return fonctionario;
	}

}
