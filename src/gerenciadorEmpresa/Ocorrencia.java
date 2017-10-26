package gerenciadorEmpresa;

public class Ocorrencia {
	Prioridades prioridades;
	String resumo;
	private Funcionario fonctionario;
	private int codigo_ocorrencia;
	private static int codigo_ocorencias = 0;
	
	public Ocorrencia(Prioridades p, String string, Funcionario fonctionario) {
		this.prioridades=p;
		this.resumo=string;
		this.fonctionario=fonctionario;
		this.codigo_ocorrencia = codigo_ocorencias;
		codigo_ocorencias += 1;
	}

	public Object getPrioridade() {
		return prioridades;
	}

	public long getChave() {
		return codigo_ocorrencia;
	}

	public String getResume() {
		
		return resumo;
	}

	public Funcionario getFonctionario() {
		return fonctionario;
	}

}
