package atividade1.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividade1.uimaps.FormularioMap;

public class FormularioPage {
	WebDriver driver;

	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}

	FormularioMap formularioMap = new FormularioMap(driver);

	//preenche os formularios do caso de teste
	public void preencherFormulario() {
		formularioMap.radioBtn1.click(driver);
		formularioMap.radioBtn2.click(driver);
		formularioMap.textBox1.sendKeys(driver, "Olá, tudo bem!");
		formularioMap.textBox2.sendKeys(driver, "Consultoria");
		formularioMap.radioBtn2.click(driver);
		formularioMap.textBox3.sendKeys(driver, "Por enquanto está dando certo!");
		formularioMap.textBox4.sendKeys(driver, "Opa");
		formularioMap.btnSubmit.click(driver);

	}

	/**
	 * metodo que valida a mensagem de sucesso
	 */
	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.tituloMensagem.getValue())).getText();
			System.out.println(resultado);
			Assert.assertEquals("Erro ao ao validar botao da mensagem de sucesso!", "Congrats, You Completed the First Step!", resultado);
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha");
		}
	}
}
