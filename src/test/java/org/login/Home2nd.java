package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home2nd extends BaseClass{
	public Home2nd() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
private WebElement location;
	
	@FindBy(id="hotels")
private WebElement	hotels;
	
	@FindBy(id="room_type")
private WebElement Room;
	
	@FindBy(id="room_nos")
private WebElement Noofroom;

	@FindBy(id="datepick_in")
private WebElement	Checkin;	

	@FindBy(id="datepick_out")
	private WebElement Checkout;

	@FindBy(id="adult_room")
	private WebElement Adult;

	@FindBy(id="child_room")
	private WebElement Children;

	@FindBy(id="Submit")
	private WebElement Submit;
	
	
public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom() {
	return Room;
}

public WebElement getNoofroom() {
	return Noofroom;
}

public WebElement getCheckin() {
	return Checkin;
}

public WebElement getCheckout() {
	return Checkout;
}

public WebElement getAdult() {
	return Adult;
}

public WebElement getChildren() {
	return Children;
}

public WebElement getSubmit() {
	return Submit;
}


}
