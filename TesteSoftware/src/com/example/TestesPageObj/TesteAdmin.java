package com.example.TestesPageObj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.PageObj.MenuAdmin;
import com.example.PageObj.PaginaAdmin;
import com.example.PageObj.PaginaHome;
import com.example.PageObj.PaginaLogin;
import com.example.driver.Driver;

public class TesteAdmin {

	public TesteAdmin() {
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
	public void testeAdmin() throws Exception {

		TesteLogin testeLogin = new TesteLogin();
		testeLogin.testeLogin();

		PaginaHome pageHome = new PaginaHome();
		pageHome.getMenuGear().click();
		
		
		MenuAdmin menuAdmin = new MenuAdmin();
		menuAdmin.getBotaoAdmin().click();
		//assertEquals("Pending",menuAdmin.getBotaoAdmin().getText());
		//menuAdmin.getBotaoIdiomaIngles().click();
		

		PaginaAdmin pageAdmin = new PaginaAdmin();
		assertEquals("Vertical",  pageAdmin.getlabelVertical().getText());

	}
}
