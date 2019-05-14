package QLPhongKham.QuanLyPhongKham.pages;

import org.openqa.selenium.JavascriptExecutor;

import QuanLyPhongKham.Common.Util;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://10.60.108.139:8010/")
public class HomePage extends PageObject{
	@FindBy(id="Share_AdminLayout_UserName")
	private WebElementFacade txt_nameUserLogged;

	@FindBy(xpath="//span[@class='x-tab-inner x-tab-inner-center' and contains(text(),'Khám bệnh ngoại trú')]")
	private WebElementFacade lb_menu;

	@FindBy(xpath="//*[@data-id='TiepDonPk']")
	private WebElementFacade lb_tiepDon;

	@FindBy(xpath="//*[@data-id='KhamBenhPk']")
	private WebElementFacade lb_khamBenh;

	public String getTextNameUser() {
		return txt_nameUserLogged.getText();
	}
	public boolean User_is_displayed() {
		return txt_nameUserLogged.isDisplayed();
	}

	public void click_lb_TiepDon(){

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lb_tiepDon.click();
	}
	public void go_to_search_patient() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		lb_menu.click();

	}
} 
