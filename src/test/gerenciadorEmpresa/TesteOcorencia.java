package test.gerenciadorEmpresa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gerenciadorEmpresa.Empresa;
import gerenciadorEmpresa.Funcionario;
import gerenciadorEmpresa.Ocorrencia;
import gerenciadorEmpresa.Prioridades;
import gerenciadorEmpresa.Projeto;

public class TesteOcorencia {
	
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
	public void criarOcurrencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		assertEquals(Prioridades.ALTA, ocurencia.getPrioridade());
	}
	
	@Test
	public void recuperarChaveDaOcurrencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		long chave = ocurencia.getChave();
		assertNotEquals(null, chave);
	}
	
	@Test
	public void recuperarResumoOcurrencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		String resume = ocurencia.getResume();
		assertEquals(resume, "resumo");
	}	
	
	@Test
	public void recuperarFuncionarioOcurrencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		Funcionario fonctionario2 = ocurencia.getFonctionario();
		assertEquals(fonctionario,fonctionario2);
	}

	@Test
	public void verificarOcorrenciaUnica() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		
		assertNotEquals(new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario).getChave(), ocurencia.getChave());
	}
	
	/*

Lista de testes


verificar que a chave de ocurencia e unica.
 
	 */

}
