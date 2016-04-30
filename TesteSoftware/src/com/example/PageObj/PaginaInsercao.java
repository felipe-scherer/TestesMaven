package com.example.PageObj;

//
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;


public class PaginaInsercao {
	private WebElement buttonSuporte;
	private WebElement tfEmpresa;
	private WebElement buttonBuscar;
	private ArrayList<String> listobject;

	public PaginaInsercao() {

		buttonSuporte = Driver.getDriver().findElement(By.id("suporteA"));
		buttonSuporte.click();
		tfEmpresa = Driver.getDriver().findElement(By.id("empresa"));
		buttonBuscar= Driver.getDriver().findElement(By.cssSelector("input.botao.submit"));

	}

/*	public void setObjetos() {
		listobject = new ArrayList<String>();
		listobject.add(buttonSair.getText());
		listobject.add(buttonEstatisticas.getText());
		listobject.add(buttonElipseCare.getText());
		listobject.add(buttonTreinamentos.getText());
		listobject.add(buttonMailTreinamentos.getText());
	}*/
	
	

	public ArrayList<String> getObjetos() {
		return listobject;
	}

	public WebElement getButtonSuporte() {
		return buttonSuporte;
	}

	public void setButtonSuporte(WebElement buttonSuporte) {
		this.buttonSuporte = buttonSuporte;
	}

	public WebElement getTfEmpresa() {
		return tfEmpresa;
	}

	public void setTfEmpresa(WebElement tfEmpresa) {
		this.tfEmpresa = tfEmpresa;
	}

	public WebElement getButtonBuscar() {
		return buttonBuscar;
	}

	public void setButtonBuscar(WebElement buttonBuscar) {
		this.buttonBuscar = buttonBuscar;
	}

	public ArrayList<String> getListobject() {
		return listobject;
	}

	public void setListobject(ArrayList<String> listobject) {
		this.listobject = listobject;
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
