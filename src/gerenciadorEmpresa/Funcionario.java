package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	/**
	 * Deve ser menor do que 10.
	 */
	private List <Projeto> projetosResponsavel;
	private List <Projeto> projetosQueParticipa;
	private List <Ocorrencia> ocorrencias;
	
	
	public Funcionario() {
		projetosResponsavel = new ArrayList<Projeto>();
		projetosQueParticipa = new ArrayList<Projeto>();
		ocorrencias = new ArrayList<Ocorrencia>();
	}

	public void addProjetoResponsavel(Projeto projeto) {
		if( projetosResponsavel.size() < 10 )
		{
			this.projetosResponsavel.add(projeto);
		}
	}

	public List<Projeto> getProjetosResponsavel() {
		return this.projetosResponsavel;
	}

	public void addProjetoQueParticipa(Projeto projeto)
	{
		this.projetosQueParticipa.add( projeto );
	}
	
	public List<Projeto> getProjetos() {
		return this.projetosQueParticipa;
	}
	
	public void addOcorrenciasResponsavel(Prioridades alta, String string) throws Exception {
		
		if( getOcorrenciasAbertas().size() < 10 )
		{
			this.ocorrencias.add( new Ocorrencia(alta, "resumo", this) );
		}
		else
		{
			throw new Exception( "Não pode ter mais do que 10 ocorrencias." );
		}
		
	}

	public List<Ocorrencia> getOcorrencias() {
		return this.ocorrencias;
	}

	public List<Ocorrencia> getOcorrenciasAbertas() {
		List <Ocorrencia> ocorrenciasAbertas = new ArrayList<Ocorrencia>();
		
		for( Ocorrencia ocorrencia : this.ocorrencias )
		{
			if( ocorrencia.getEstado() )
			{
				ocorrenciasAbertas.add( ocorrencia );
			}
		}
		
		return ocorrenciasAbertas;
	}
	
	public void fecharOcorrencia(int i) {
		this.ocorrencias.get(i).fechar();
	}

	
}
