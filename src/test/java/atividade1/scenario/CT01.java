package atividade1.scenario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividade1.core.Driver;
import atividade1.pages.FormularioPage;
import atividade1.pages.InicioPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
	
	// carrega a pagina
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessoURL(driver, "https://wpforms.com/demo/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
	}
	
	// executa o teste
	@Test
	public void test() {
		inicioPage.selecionarTipoFormulario();
		formularioPage.preencherFormulario();
		formularioPage.validarMensagemSucesso();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// finaliza a pagina
	@After	
	public void after() {
		driver.close();
	}
}
