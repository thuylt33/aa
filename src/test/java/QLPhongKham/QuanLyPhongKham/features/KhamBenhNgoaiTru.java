package QLPhongKham.QuanLyPhongKham.features;

import java.text.ParseException;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import QLPhongKham.QuanLyPhongKham.steps.serenity.KhamBenhNgoaiTruSteps;
import QLPhongKham.QuanLyPhongKham.steps.serenity.TiepDonSteps;
import QuanLyPhongKham.Common.Datapool;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTagValuesOf;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="template/khambenhngoaitru.csv") 
@WithTagValuesOf({"feature:KhamBenhNgoaiTru"})
public class KhamBenhNgoaiTru {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	KhamBenhNgoaiTruSteps khamBenh;
	@Steps
	Login login;
	private String  phongKham,trangThai,timKiem,tuNgay,denNgay;



	public String getTimKiem() {
		return timKiem;
	}



	public String getTuNgay() {
		return tuNgay;
	}



	public void setTuNgay(String tuNgay) {
		this.tuNgay = tuNgay;
	}



	public String getDenNgay() {
		return denNgay;
	}



	public void setDenNgay(String denNgay) {
		this.denNgay = denNgay;
	}



	public void setTimKiem(String timKiem) {
		this.timKiem = timKiem;
	}



	public String getPhongKham() {
		return phongKham;
	}



	public void setPhongKham(String phongKham) {
		this.phongKham = phongKham;
	}



	public String getTrangThai() {
		return trangThai;
	}



	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}






	@Test
	public void tim_kiem_benh_nhan_kham_benh_ngoai_tru() throws ParseException{
		//given
		login.LoginPass();
		//when 
		khamBenh.click_lb_khambenhngoaitru();
		khamBenh.enter_phongKham(phongKham);

		khamBenh.enter_trangThai(trangThai);
		if(!timKiem.equals("")) {
			khamBenh.enter_id_benhNhan(timKiem);
		}
		if(!tuNgay.equals("")) {
			khamBenh.enter_tuNgay(tuNgay);
		}
		if(!denNgay.equals("")) {
			khamBenh.enter_denNgay(denNgay);
		}
		khamBenh.click_btn_search();
		//then
		khamBenh.assertTrue_search_Patient(timKiem,trangThai,phongKham,tuNgay,denNgay);
	}

}

