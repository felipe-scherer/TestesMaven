package com.example.PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;

public class PaginaAdmin {
	
	private WebElement labelVertical;
	
	

	public PaginaAdmin() {
		
		labelVertical = Driver.getDriver().findElement(By.xpath("//form[@id='form7']/div[2]/div/div[3]"));
				
	}


	public WebElement getlabelVertical() {
		return labelVertical;
	}



	public void setlabelVertical(WebElement labelVertical) {
		this.labelVertical = labelVertical;
	}




	
	

}
