package com.example.TestesPageObj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.jetty.html.Page;

import com.example.PageObj.PaginaInsercao;
import com.example.driver.Driver;


public class TesteInsercao {

	public TesteInsercao() {
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
	public void testInsercao() throws Exception {
	
		PaginaInsercao page = new PaginaInsercao();
		page.getTfEmpresa().sendKeys("elipse");
		page.getButtonBuscar().click();
		//assertEquals("SCRM", loginPage.getTitle());
		
	}
}
