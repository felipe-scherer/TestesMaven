package com.example.PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;

public class PaginaHome {
	
	private WebElement IdentificadorPagina;
	private WebElement botaoSair;
	private WebElement botaoAtividades;
	private WebElement menuGear;
	

	

	public PaginaHome() {
		
		IdentificadorPagina = Driver.getDriver().findElement(By.id("HereIAm"));
		botaoSair = Driver.getDriver().findElement(By.xpath("(//a[@id='buscaA']/div)[2]"));
		botaoAtividades = Driver.getDriver().findElement(By.xpath("(//a[@id='AtividadesA']/div)"));
		menuGear = Driver.getDriver().findElement(By.cssSelector("span.icon-gear391"));
		
		
	}
	
	



	public WebElement getBotaoAtividades() {
		return botaoAtividades;
	}





	public void setBotaoAtividades(WebElement botaoAtividades) {
		this.botaoAtividades = botaoAtividades;
	}





	public WebElement getMenuGear() {
		return menuGear;
	}





	public void setMenuGear(WebElement menuGear) {
		this.menuGear = menuGear;
	}

	public WebElement getIdentificadorPagina() {
		return IdentificadorPagina;
	}



	public void setIdentificadorPagina(WebElement identificadorPagina) {
		IdentificadorPagina = identificadorPagina;
	}



	public WebElement getBotaoSair() {
		return botaoSair;
	}



	public void setBotaoSair(WebElement botaoSair) {
		this.botaoSair = botaoSair;
	}
	
	
	

}
