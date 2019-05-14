package QLPhongKham.QuanLyPhongKham.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://10.60.108.139:8010/")
public class LoginPage extends PageObject {

    @FindBy(name="username")
    private WebElementFacade txt_user;

    @FindBy(name="password")
    private WebElementFacade txt_pass;

    @FindBy(xpath="//*[@class='btn btn-register']")
    private WebElementFacade btn_submit;
    
    @FindBy(id="status")
    private WebElementFacade Login_Error;
    
    public void enter_username(String username) {
    	txt_user.type(username);
    }

    public void enter_password(String password) {
    	txt_pass.type(password);
    }

	public void enter_btn_submit() {
		// TODO Auto-generated method stub
		btn_submit.click();
		
	}

	public String  LoginNotificationFailse() {
		// TODO Auto-generated method stub
		return Login_Error.getText();
	}

}