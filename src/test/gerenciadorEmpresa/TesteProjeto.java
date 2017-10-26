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
import gerenciadorEmpresa.Projeto;

public class TesteProjeto {
	
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Empresa empresa;
	private Funcionario joao;
	private Projeto projeto;
	

	@Before
	public void setUp() throws Exception {
		this.empresa =new Empresa();
		this.joao = new Funcionario();
		this.projeto = new Projeto();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void CrearProjeto() throws Exception {
		Projeto projeto = new Projeto();
		assertNotEquals(null, projeto);
	}
		
	@Test
	public void obterOcorrencia() throws Exception {
		Ocorrencia oco = new Ocorrencia(null, null, joao);
		projeto.addOcorrencia(oco);
		assertEquals( oco, projeto.getOcorrencia(0));
	}
	
	

	

}
