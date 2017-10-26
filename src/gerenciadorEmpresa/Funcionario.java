package gerenciadorEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	/**
	 * Deve ser menor do que 10.
	 */
	private List <Projeto> projetosResponsavel;
	private List <Projeto> projetosQueParticipa;
	
	public Funcionario() {
		projetosResponsavel = new ArrayList<Projeto>();
		projetosQueParticipa = new ArrayList<Projeto>();
	}

	public void addProjetorResponsavel(Projeto projeto) {
		this.projetosResponsavel.add(projeto);
	}

	public List<Projeto> getProjetosResponsavel() {
		return this.projetosResponsavel;
	}

	public void addProjetoQueParticipa(Projeto projeto)
	{
		if( projetosQueParticipa.size() < 10 )
		{
			this.projetosQueParticipa.add( projeto );
		}
	}
	
	public List<Projeto> getProjetos() {
		return this.projetosQueParticipa;
	}

}
