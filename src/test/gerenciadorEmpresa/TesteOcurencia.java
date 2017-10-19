package test.gerenciadorEmpresa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteOcurencia {
	
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Empresa empresa;
	private Fonctionario joao;
	private Projeto projeto;
	

	@Before
	public void setUp() throws Exception {
		this.empresa =new Empresa();
		this.joao = new Fonctionario();
		this.projeto = new Projeto();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void CrearEmpresa() {
		assertNotEquals(null, new Empresa());
	}
	
	@Test
	public void CrearFonctionario() throws Exception {
		Fonctionario joao = new Fonctionario();
		assertNotEquals(null, joao);
	}
	
	@Test
	public void CrearProjeto() throws Exception {
		Projeto projeto = new Projeto();
		assertNotEquals(null, projeto);
	}
	
	@Test
	public void CrearOcurencia() throws Exception {
		Fonctionario fonctionario = new Fonctionario();
		Ocurencia ocurencia= new Ocurencia(Prioridades.ALTA, "resumo",fonctionario);
		assertEquals(Prioridades.ALTA, ocurencia.getPrioridade());
	}
	
	@Test
	public void aditionarFonctionariosEmpressa() throws Exception {
		empresa.addFontionario(joao);
		assertEquals(joao, empresa.getFonctionario(0));
	}
	
	@Test
	public void aditionar2FonctionariosEmpressa() throws Exception {
		empresa.addFontionario(joao);
		Fonctionario mario =new Fonctionario();
		empresa.addFontionario(mario);
		assertEquals(joao, empresa.getFonctionario(0));
		assertEquals(mario, empresa.getFonctionario(1));
	}
	
	@Test
	public void aditionarProjetoNaEmpresa() throws Exception {
		empresa.addProjeto(projeto);
		assertEquals(projeto, empresa.getProjeto(0));
	}
	
	
	
	/*Lista de testes





ocurencia.getChave
ocurencia.getResume
ocurencia.getFoncionario
funcionario.addProjeto
foncionario.getProjetos
foncionario.getporjetoResponsavel (verifica <=10)
foncoinario.addProjectoResponsavel (verifica <=10)



	 */
	
	

}
