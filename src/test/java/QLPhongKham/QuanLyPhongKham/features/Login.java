package QLPhongKham.QuanLyPhongKham.features;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTagValuesOf;

import org.junit.FixMethodOrder;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import QLPhongKham.QuanLyPhongKham.steps.serenity.LoginSteps;
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.DEFAULT)
@WithTagValuesOf({"feature:Login"})
public class Login {

	@Managed(uniqueSession =false)
	public WebDriver webdriver;

	@Steps
	public LoginSteps user;

	
	@Test
	public void LoginFail() {
		//given
		user.is_the_home_page();
		//when
		user.enter_UserName("56a01_admin");
		user.enter_password("1qa222222");
		user.enter_submit();
		// then
		user.LoginFail();
	}
	@Test
	public void LoginPass() {
		//given
		user.is_the_home_page();
		//when
		user.enter_UserName("56a01_test");
		user.enter_password("1qazXSW@");
		user.enter_submit();
		// then
		user.userLoggedPage();
	}
} 