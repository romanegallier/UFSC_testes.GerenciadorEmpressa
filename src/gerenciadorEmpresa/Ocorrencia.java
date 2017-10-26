package gerenciadorEmpresa;

public class Ocorrencia {
	Prioridades prioridades;
	String resumo;
	private Funcionario responsavel;
	private int codigo_ocorrencia;
	private boolean isAberta;
	private static int codigo_ocorencias = 0;
	
	public Ocorrencia(Prioridades p, String string, Funcionario fonctionario) {
		this.prioridades=p;
		this.resumo=string;
		this.responsavel=fonctionario;
		
		this.isAberta = true;
		
		this.codigo_ocorrencia = codigo_ocorencias;
		codigo_ocorencias += 1;
	}

	public long getChave() {
		return codigo_ocorrencia;
	}

	public String getResume() {
		
		return resumo;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public boolean getEstado() {
		return this.isAberta;
	}

	public void fechar() {
		this.isAberta = false;
	}

	public void setPrioridade(Prioridades media) {
		this.prioridades = media;
	}
	
	public Object getPrioridade() {
		return prioridades;
	}

	public void setResponsavel(Funcionario fonctionario2) {
		this.responsavel = fonctionario2;
	}
}
