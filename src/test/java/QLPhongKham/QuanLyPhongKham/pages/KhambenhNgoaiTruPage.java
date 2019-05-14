package QLPhongKham.QuanLyPhongKham.pages;

import java.util.NoSuchElementException;

import org.fluentlenium.core.wait.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import com.ibm.icu.impl.duration.TimeUnit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://00.60.008.039:8000/")
public class KhambenhNgoaiTruPage extends PageObject {
	@FindBy(xpath="//*[@data-id='KhamBenhPk']")
	private WebElementFacade lb_khambenh;

	@FindBy(xpath="//*[@ id='preloader' and contains(@style,'display: none' )]")
	private WebElementFacade load_page;

	@FindBy(id="id_ngayvaokham-inputEl")
	private WebElementFacade span_date;

	@FindBy(xpath="//*[@id='xp_id_dsKhoaKB_khambenh-inputCell']/parent::tr//td[@class=' x-trigger-cell x-unselectable']")
	private WebElementFacade dropdow_khambenh;

	private By select_phongKham(String phongKham){
		return By.xpath("//div[contains(text(),'"+phongKham+"')]");
	}

	@FindBy(xpath="//*[@id='xp_id_trangthaiBN_khambenh-inputCell']/parent::tr//td[@class=' x-trigger-cell x-unselectable']")
	private WebElementFacade dropdown_status;

	private By select_trangThai(String trangThai){
		return By.xpath("//li[contains(text(),'"+trangThai+"')]");
	}
	@FindBy(id="xp_txt_SearchBnKb")
	private WebElementFacade input_search_ID_Patient;

	@FindBy(id="id_frmChanDoanSoBo")
	private WebElementFacade input_trieuChung;

	private By btn_next_page(){
		return By.xpath("//a[@class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-icon x-btn-icon x-btn-default-toolbar-small-icon']//span[@class='x-btn-icon-el x-tbar-page-next ']");
	}
	@FindBy(xpath="//a[@class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-icon x-btn-icon x-btn-default-toolbar-small-icon x-item-disabled x-disabled x-btn-disabled x-btn-default-toolbar-small-disabled']//span[@class='x-btn-icon-el x-tbar-page-next ']")
	private WebElementFacade btn_next_page_disable;

	private By lb_ngayDK(int row){
		return By.xpath("//tr[@role='row']["+row+"]/td[12]");
	}


	private By lb_phongKham(int row){
		return By.xpath("//tr[@role='row']["+row+"]/td[14]");
	}

	@FindBy(id="xp_txt_SearchBnKb")
	private WebElementFacade lb_timKiem;

	private By list_trangThai(int row){
		return By.xpath("//tr[@role='row']["+row+"]/td[10]");
	}

	private By total_row(){
		return By.xpath("//tr[@role='row']//img[@data-qtip='Bắt đầu khám bệnh']");
	}




	@FindBy(id="xp_id_ngaythang_khambenh-inputEl")
	private WebElementFacade input_tuNgay;

	private By span_first_patient(){
		return By.xpath("//tr[@role='row']//div[contains(text(),'Chờ khám')]");
	}
	private By has_1_patient_examined(){
		return By.xpath("//tr[@role='row']//div[contains(text(),'Đã khám bệnh')]");
	}

	private By span_id_benhNhan(){
		return By.xpath("//tr[@role='row']//div[contains(text(),'Chờ khám')]/parent::td/parent::tr/td[5]");
	}
	private By span_ngay(){
		return By.xpath("//tr[@role='row']//div[contains(text(),'Chờ khám')]/parent::td/parent::tr/td[12]");
	}


	@FindBy(id="xp_id_DenNgaythang_khambenh-inputEl")
	private WebElementFacade input_denNgay;

	@FindBy(id="id_frmMaBenhNhan")
	private WebElementFacade span_id_patient;

	@FindBy(id="xp_btnInsert")
	private WebElementFacade button_search;

	private By lb_maYTe(int row){
		return By.xpath("//tr[@role='row']["+row+"]/td[5]");
	}


	public void click_lb_khambenh() {
		// TODO Auto-generated method stub
		lb_khambenh.click();

	}

	public void click_dropdown_phongKham() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dropdow_khambenh.click();

	}

	public void click_phongKham(String phongKham) {
		// TODO Auto-generated method stub
		this.getDriver().findElement(select_phongKham(phongKham)).click();

	}

	public void click_dropdown_TrangThai() {
		// TODO Auto-generated method stub
		dropdown_status.click();
	}

	public void click_trangThai(String trangThai) {
		// TODO Auto-generated method stub
		this.getDriver().findElement(select_trangThai(trangThai)).click();

	}

	public void enterID_Patient(String idBenhNhan) {
		// TODO Auto-generated method stub
		input_search_ID_Patient.type(idBenhNhan);

	}

	public void click_btn_search() {
		// TODO Auto-generated method stub
		button_search.click();

	}

	public void enter_tuNgay(String tuNgay) {
		// TODO Auto-generated method stub
		input_tuNgay.type(tuNgay);

	}



	public void enter_denNgay(String denNgay) {
		// TODO Auto-generated method stub
		input_denNgay.type(denNgay);

	}

	public String getValue_trangThai(int row) {
		// TODO Auto-generated method stub
		return this.getDriver().findElement(list_trangThai(row)).getText();
	}



	public String getValue_phongKham(int row) {
		// TODO Auto-generated method stub
		return this.getDriver().findElement(lb_phongKham(row)).getText();
	}



	public String getValue_maYte(int row) {
		// TODO Auto-generated method stub
		return this.getDriver().findElement(lb_maYTe(row)).getText();
	}

	public String getValue_NgayDK(int row) {
		// TODO Auto-generated method stub
		return this.getDriver().findElement(lb_ngayDK(row)).getText();
	}


	public int getRowResult() {
		// TODO Auto-generated method stub
		return this.getDriver().findElements(total_row()).size();
	}


	public int  btn_next_page_isDisplayed() {
		// TODO Auto-generated method stub
		return this.getDriver().findElements(btn_next_page()).size();

	}

	public boolean btn_next_page__disable_isDisplayed() {
		// TODO Auto-generated method stub
		return btn_next_page_disable.isDisplayed();

	}



	public void click_nextPage() {
		// TODO Auto-generated method stub
		this.getDriver().findElement(btn_next_page()).click();

	}


	public void double_click_first_patient() {
		// TODO Auto-generated method stub
		Actions action= new Actions(this.getDriver());
		action.doubleClick(this.getDriver().findElements(span_first_patient()).get(0)).perform();
	}


	public void enter_trieuChung(String trieuChung) {
		// TODO Auto-generated method stub
		input_trieuChung.type(trieuChung);

	}


	public String getText_ID_patient() {
		// TODO Auto-generated method stub
		return this.getDriver().findElements(span_id_benhNhan()).get(0).getText();

	}


	public String getText_Ngay() {
		// TODO Auto-generated method stub
		return this.getDriver().findElements(span_ngay()).get(0).getText();
	}


	public void search_By_clinic_va_id_patient_va_date(String id_benhNhan, String search_date) {
		// TODO Auto-generated method stub

		enterID_Patient(id_benhNhan);
		enter_tuNgay(search_date);
		enter_denNgay(search_date);
		click_btn_search();


	}


	public boolean  the_patient_is_examined() {
		// TODO Auto-generated method stub
		return this.getDriver().findElements(has_1_patient_examined()).get(0).isDisplayed();




	}
	public void  the_page_load_already() {
		load_page.waitUntilPresent();
	}
}
