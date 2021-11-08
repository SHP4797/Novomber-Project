package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home4th extends BaseClass {
public Home4th() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement FN;

@FindBy(id="last_name")
private WebElement LN;

@FindBy(id="address")
private WebElement ADD;

@FindBy(id="cc_num")
private WebElement CCNO;

@FindBy(id="cc_cvv")
private WebElement CCType;

@FindBy(id="cc_type")
private WebElement Exp;

@FindBy(id="cc_exp_month")
private WebElement EXpDate;

@FindBy(id="cc_exp_year")
private WebElement CVV;

@FindBy(id="book_now")
private WebElement BN;


public WebElement getFN() {
	return FN;
}


public WebElement getLN() {
	return LN;
}


public WebElement getADD() {
	return ADD;
}


public WebElement getCCNO() {
	return CCNO;
}


public WebElement getCCType() {
	return CCType;
}


public WebElement getExp() {
	return Exp;
}


public WebElement getEXpDate() {
	return EXpDate;
}


public WebElement getCVV() {
	return CVV;
}


public WebElement getBN() {
	return BN;
}

}
