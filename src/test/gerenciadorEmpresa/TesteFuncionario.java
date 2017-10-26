package test.gerenciadorEmpresa;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import gerenciadorEmpresa.Empresa;
import gerenciadorEmpresa.Funcionario;
import gerenciadorEmpresa.Projeto;

public class TesteFuncionario {

	private Empresa empresa;
	private Funcionario joao;
	private Projeto projeto;
	

	@Before
	public void setUp() throws Exception {
		this.empresa =new Empresa();
		this.joao = new Funcionario();
		this.projeto = new Projeto();
	}

	

	@Test
	public void criarFonctionario() throws Exception {
		assertNotEquals(null, joao);
	}
	
	
	@Test
	public void additionarProjetoNoFunctionario() throws Exception {
		joao.addProjeto(projeto);
		List<Projeto> l =joao.getProjetos();
		assertEquals(1, l.size());
		assertEquals(projeto, l.get(0));
	}
	
	@Test
	public void getResponsavelDoProjeto() throws Exception {
		//TODO
	}
	/*Lista de testes







foncionario.getporjetoResponsavel (verifica <=10)
foncoinario.addProjectoResponsavel (verifica <=10)

verificar que a chave de ocurencia e unica.

	 */
	

}
