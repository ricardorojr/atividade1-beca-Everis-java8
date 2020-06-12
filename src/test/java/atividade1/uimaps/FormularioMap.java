package atividade1.uimaps;

import org.openqa.selenium.WebDriver;

import atividade1.core.Element;
import atividade1.enums.ByValue;

public class FormularioMap {
	WebDriver driver;
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Formulario
	public Element radioBtn1 = new Element(driver, ByValue.ID, "wpforms-260271-field_1_1");
	public Element textBox1 = new Element(driver, ByValue.ID, "wpforms-260271-field_2");
	public Element textBox2 = new Element(driver, ByValue.ID, "wpforms-260271-field_3");
	public Element radioBtn2 = new Element(driver, ByValue.ID, "wpforms-260271-field_4_3");
	public Element textBox3 = new Element(driver, ByValue.ID, "wpforms-260271-field_5");
	public Element textBox4 = new Element(driver, ByValue.ID, "wpforms-260271-field_6");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']");
	
	//Mensagem
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	

}
