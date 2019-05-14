package QLPhongKham.QuanLyPhongKham.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import QLPhongKham.QuanLyPhongKham.steps.serenity.TiepDonSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTagValuesOf;
@RunWith(SerenityRunner.class)
@WithTagValuesOf({"feature:TiepDonDefault"})
public class TiepDon_View_default {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	TiepDonSteps tiepDon;
	
	@Steps
	Login login;
	
	@Test
	public void ckeck_default_value_TiepDonBenhNhan() {
		//given
		login.LoginPass();
		//when
		tiepDon.click_lb_tiepDon();
		
		//then
		tiepDon.ckeck_defalutValue();
	}
	
}
