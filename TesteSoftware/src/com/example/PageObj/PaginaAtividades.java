package com.example.PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;

public class PaginaAtividades {
	
	private WebElement AtividadeCadastrada;

	

	public PaginaAtividades() {
		
		AtividadeCadastrada = Driver.getDriver().findElement(By.cssSelector("div[title=\"teste scherer\"]"));
		
		
	}


	public WebElement getAtividadeCadastrada() {
		return AtividadeCadastrada;
	}



	public void setAtividadeCadastrada(WebElement atividadeCadastrada) {
		AtividadeCadastrada = atividadeCadastrada;
	}
	
	
	

}
