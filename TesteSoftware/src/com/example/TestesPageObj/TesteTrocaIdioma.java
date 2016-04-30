package com.example.TestesPageObj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.PageObj.MenuAdmin;
import com.example.PageObj.PaginaHome;
import com.example.PageObj.PaginaLogin;
import com.example.driver.Driver;

public class TesteTrocaIdioma {

	public TesteTrocaIdioma() {
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
	public void trocarIdioma() throws Exception {

		TesteLogin testeLogin = new TesteLogin();
		testeLogin.testeLogin();

		PaginaHome pageHome = new PaginaHome();
		pageHome.getMenuGear().click();
		
		
		MenuAdmin menuAdmin = new MenuAdmin();
		menuAdmin.getBotaoIdiomas().click();
		menuAdmin.getBotaoIdiomaIngles().click();
		

		PaginaHome pageHome2 = new PaginaHome();
		assertEquals("Pending", pageHome2.getIdentificadorPagina().getText());

	}
}
