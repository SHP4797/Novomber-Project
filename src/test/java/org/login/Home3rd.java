package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home3rd extends BaseClass{
	public Home3rd() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
private WebElement Radio;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
public WebElement getRadio() {
	return Radio;
}
public WebElement getContinue() {
	return Continue;
}

}
