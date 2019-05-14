package QLPhongKham.QuanLyPhongKham.steps.serenity;

import QLPhongKham.QuanLyPhongKham.pages.HomePage;
import QLPhongKham.QuanLyPhongKham.pages.LoginPage;
import QuanLyPhongKham.Common.SendAutoMail;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

	LoginPage user;
	
	HomePage homePage;
	SendAutoMail sendEmail;
	@Step
	public void enter_UserName(String username) {
		user.enter_username(username);
	}

	@Step
	public void enter_password(String pass) {
		user.enter_password(pass);
	}


	@Step
	public void is_the_home_page() {
		user.open();
	}
	
	@Step
	public void userLoggedPage() {
		if(homePage.getTextNameUser().contains("56a01_test")) {
			assert true;
		}else if(homePage.User_is_displayed()==false){
			sendEmail.sendEmail();
			assert false;
		}else {
			System.out.println("Đã login được vào hệ thống nhưng sai tên hiển thị người dùng");
			assert false;
		}
	}
	
	@Step
	public void enter_submit() {
		// TODO Auto-generated method stub
		user.enter_btn_submit();
		
	}

	public void LoginFail() {
		// TODO Auto-generated method stub
		assertEquals(user.LoginNotificationFailse(),"Username hoặc password không đúng.");
	}

	

}