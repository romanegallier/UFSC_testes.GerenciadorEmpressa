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
	public void CrearOcurencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		assertEquals(Prioridades.ALTA, ocurencia.getPrioridade());
	}
	
	
	
	@Test
	public void reucperarChaveDaOcurencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		long chave = ocurencia.getChave();
		assertNotEquals(null, chave);
	}
	
	@Test
	public void recuperarResumeOcurencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		String resume = ocurencia.getResume();
		assertEquals(resume, "resumo");
	}	
	
	@Test
	public void recuperarFonctionarioOcurencia() throws Exception {
		Funcionario fonctionario = new Funcionario();
		Ocorrencia ocurencia= new Ocorrencia(Prioridades.ALTA, "resumo",fonctionario);
		Funcionario fonctionario2 = ocurencia.getFonctionario();
		assertEquals(fonctionario,fonctionario2);
	}
	
	

}
