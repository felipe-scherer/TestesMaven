package com.example.PageObj;

//
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;


public class PaginaLogin {
	private WebElement buttonEntrar;
	private WebElement tfUser;
	private WebElement tfPW;
	private WebElement h1SCRM;
	

	public PaginaLogin() {
		
		buttonEntrar = Driver.getDriver().findElement(By.cssSelector("button"));
		tfUser = Driver.getDriver().findElement(By.name("usr"));
		tfPW = Driver.getDriver().findElement(By.name("pw"));
		h1SCRM = Driver.getDriver().findElement(By.cssSelector("h1"));

	}


	public WebElement getH1SCRM() {
		return h1SCRM;
	}


	public void setH1SCRM(WebElement h1scrm) {
		h1SCRM = h1scrm;
	}


	public WebElement getButtonEntrar() {
		return buttonEntrar;
	}


	public void setButtonEntrar(WebElement buttonEntrar) {
		this.buttonEntrar = buttonEntrar;
	}


	public WebElement getTfUser() {
		return tfUser;
	}


	public void setTfUser(WebElement tfUser) {
		this.tfUser = tfUser;
	}


	public WebElement getTfPW() {
		return tfPW;
	}


	public void setTfPW(WebElement tfPW) {
		this.tfPW = tfPW;
	}


	
	


/*	public WebElement getResultadoBusca() {
		return ResultadoBusca;
	}

	public void setResultadoBusca(WebElement ResultadoBusca) {
		this.ResultadoBusca = ResultadoBusca;
	}

	public WebElement getbuttonBusca() {
		return buttonBusca;
	}

	public void setgetbuttonBusca(WebElement buttonBusca) {
		this.buttonBusca = buttonBusca;
	}

	public WebElement getinputFieldName() {
		return inputFieldName;
	}

	public void setinputFieldName(WebElement inputFieldName) {
		this.inputFieldName = inputFieldName;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public void setButtonPesquisar(WebElement buttonPesquisar) {
		this.buttonPesquisar = buttonPesquisar;
	}

	public String verificaAcessoAdmin() {
		return buttonAdmin.getText();
	}

	public void AbreTelaAdmin() {
		buttonAdmin.click();
	}

	public void AbreTelaTreinamento() {
		buttonBusca.click(); // WebElement
	}

	public void AbreTelaBuscarSuportes() {
		buttonBuscarSuporte.click();
	}

	public void AbreTelaConfiguracoes() {
		buttonConfiguracoes.click();
	}

	public void AbreTelaPendencias() {
		buttonPendencias.click();
	}

	public void FecharBrowser() {
		buttonSair.click();
	}*/

}
