package atividade1.uimaps;

import org.openqa.selenium.WebDriver;

import atividade1.core.Element;
import atividade1.enums.ByValue;

public class FormularioMap {
	WebDriver driver;
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	////mapeia o radio button 1
	public Element radioBtn1 = new Element(driver, ByValue.ID, "wpforms-260271-field_1_1");
	
	//mapeia o textbox 1
	public Element textBox1 = new Element(driver, ByValue.ID, "wpforms-260271-field_2");
	
	//mapeia o textbox 2
	public Element textBox2 = new Element(driver, ByValue.ID, "wpforms-260271-field_3");
	
	//mapeia o radio button 2
	public Element radioBtn2 = new Element(driver, ByValue.ID, "wpforms-260271-field_4_3");
	
	//mapeia o textbox 3
	public Element textBox3 = new Element(driver, ByValue.ID, "wpforms-260271-field_5");
	
	//mapeia o textbox 4
	public Element textBox4 = new Element(driver, ByValue.ID, "wpforms-260271-field_6");
	
	//mapeia botao submit
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']");
	
	//mapeia o texto  validacao de formulario
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	

}
