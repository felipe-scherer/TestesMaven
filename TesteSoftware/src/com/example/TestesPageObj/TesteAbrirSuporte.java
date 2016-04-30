package com.example.TestesPageObj;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.PageObj.PaginaAtividadeAberta;
import com.example.PageObj.PaginaAtividades;
import com.example.PageObj.PaginaHome;
import com.example.PageObj.PaginaLogin;
import com.example.PageObj.PaginaSuportePendentes;
import com.example.PageObj.PaginaSuportePendentesAberto;
import com.example.driver.Driver;


public class TesteAbrirSuporte {

	public TesteAbrirSuporte() {
		// TODO Auto-generated constructor stub
	}
	private StringBuffer verificationErrors = new StringBuffer();


	@Before
	public void setUp() throws Exception {
		Driver.getDriver().get(Driver.URL_BASE + "/");
	}
	

	@After
	public void tearDown() throws Exception {


		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}

	}

	@Test
	public void testeAbrirSuporte() throws Exception {
		PaginaLogin page = new PaginaLogin();
		page.getTfUser().sendKeys("scherer");
		page.getTfPW().sendKeys("123");
		page.getButtonEntrar().click();


		PaginaSuportePendentes pendentes = new PaginaSuportePendentes();
		assertEquals("Criado", pendentes.getLabelCriado().getText());
		
		pendentes.getDivSuporte().click();

		PaginaSuportePendentesAberto pendenteAberto = new PaginaSuportePendentesAberto();
		
				
		assertEquals("Produto", pendenteAberto.getLabelProduto().getText());
		
	}
}
