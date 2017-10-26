package test.gerenciadorEmpresa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gerenciadorEmpresa.Empresa;
import gerenciadorEmpresa.Fonctionario;
import gerenciadorEmpresa.Ocurencia;
import gerenciadorEmpresa.Prioridades;
import gerenciadorEmpresa.Projeto;

public class TesteOcurencia {
	
	private Empresa empresa;
	private Fonctionario joao;
	private Projeto projeto;
	

	@Before
	public void setUp() throws Exception {
		this.empresa =new Empresa();
		this.joao = new Fonctionario();
		this.projeto = new Projeto();
	}


	
	@Test
	public void CrearOcurencia() throws Exception {
		Fonctionario fonctionario = new Fonctionario();
		Ocurencia ocurencia= new Ocurencia(Prioridades.ALTA, "resumo",fonctionario);
		assertEquals(Prioridades.ALTA, ocurencia.getPrioridade());
	}
	
	
	
	@Test
	public void reucperarChaveDaOcurencia() throws Exception {
		Fonctionario fonctionario = new Fonctionario();
		Ocurencia ocurencia= new Ocurencia(Prioridades.ALTA, "resumo",fonctionario);
		long chave = ocurencia.getChave();
		assertNotEquals(null, chave);
	}
	
	@Test
	public void recuperarResumeOcurencia() throws Exception {
		Fonctionario fonctionario = new Fonctionario();
		Ocurencia ocurencia= new Ocurencia(Prioridades.ALTA, "resumo",fonctionario);
		String resume = ocurencia.getResume();
		assertEquals(resume, "resumo");
	}	
	
	@Test
	public void recuperarFonctionarioOcurencia() throws Exception {
		Fonctionario fonctionario = new Fonctionario();
		Ocurencia ocurencia= new Ocurencia(Prioridades.ALTA, "resumo",fonctionario);
		Fonctionario fonctionario2 = ocurencia.getFonctionario();
		assertEquals(fonctionario,fonctionario2);
	}
	
	

}
