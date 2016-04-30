package com.example.PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;

public class PaginaSuportePendentes {
	
	private WebElement divSuporte;
	private WebElement labelCriado;
	
	

	public PaginaSuportePendentes() {
		
		divSuporte = Driver.getDriver().findElement(By.cssSelector("div[title=\"Elipse Software - Matriz\"]"));
		labelCriado = Driver.getDriver().findElement(By.linkText("Criado"));
				
	}



	public WebElement getLabelCriado() {
		return labelCriado;
	}



	public void setLabelCriado(WebElement labelCriado) {
		this.labelCriado = labelCriado;
	}



	public WebElement getDivSuporte() {
		return divSuporte;
	}



	public void setDivSuporte(WebElement divSuporte) {
		this.divSuporte = divSuporte;
	}

	




	
	

}
