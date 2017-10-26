package test.gerenciadorEmpresa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import gerenciadorEmpresa.Empresa;
import gerenciadorEmpresa.Funcionario;
import gerenciadorEmpresa.Projeto;

public class TesteFuncionario {

	private Funcionario joao;
	private Projeto projeto;

	@Before
	public void setUp() throws Exception {
		this.joao = new Funcionario();
		this.projeto = new Projeto();
	}

	@Test
	public void criarFonctionario() throws Exception {
		assertNotEquals(null, joao);
	}

	@Test
	public void additionarProjetoNoFunctionario() throws Exception {
		joao.addProjetorResponsavel(projeto);
		List<Projeto> responsabilidadesDoJoao = joao.getProjetosResponsavel();
		
		assertEquals(1, responsabilidadesDoJoao.size());
		assertEquals(projeto, responsabilidadesDoJoao.get(0));
	}

	@Test
	public void getProjetos() throws Exception {
		
		joao.addProjetoQueParticipa(projeto);
		List<Projeto> projetos = joao.getProjetos();
		
		assertEquals(1, projetos.size());
		assertEquals(projeto, projetos.get(0));

	}

	@Test
	public void ResponsavelPorProjetosMenorQue10() throws Exception {
		
		criar10ProjetosParaJoao();
		List<Projeto> projetos = joao.getProjetos();
		
		assertEquals(10, projetos.size());
	}

	private void criar10ProjetosParaJoao() {
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
		joao.addProjetoQueParticipa(new Projeto());
	}

}
