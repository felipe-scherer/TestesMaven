package com.example.TestesSelenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class verificaCamposInsercao {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://scrm.elipse.com.br/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testVerificaCamposInsercao() throws Exception {
		driver.get(baseUrl + "/login.jsp");
	    driver.findElement(By.name("usr")).clear();
	    driver.findElement(By.name("usr")).sendKeys("scherer");
	    driver.findElement(By.name("pw")).clear();
	    driver.findElement(By.name("pw")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
		driver.findElement(By.cssSelector("#suporteA > div")).click();
		driver.findElement(By.id("empresa")).clear();
		driver.findElement(By.id("empresa")).sendKeys("elipse");
		driver.findElement(By.cssSelector("input.botao.submit")).click();
		driver.findElement(
				By.cssSelector("div[title=\"Elipse Software - Matriz\"]"))
				.click();
		new Select(driver.findElement(By.id("selectContatoPendente")))
				.selectByVisibleText("Felipe de Carvalho Scherer");
		driver.findElement(By.id("auto")).click();
		driver.findElement(By.id("auto")).clear();
		driver.findElement(By.id("auto")).sendKeys("E3");
		
		driver.findElement(By.id("buttonInserir")).click();
		assertEquals("Dados Incompletos",driver.findElement(By.cssSelector("h3")).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
