package QLPhongKham.QuanLyPhongKham.features;

import static org.junit.Assert.assertTrue;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import QLPhongKham.QuanLyPhongKham.steps.serenity.HoSoKhamBenhSteps;
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

@UseTestDataFrom(value="template/hoSoKhamBenh.csv") 
@WithTagValuesOf({"feature:hoSoKhamBenh"})
public class HoSoKhamBenh {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	HoSoKhamBenhSteps hoSo;
	@Steps
	Login login;
	private String  phongKham,trangThai,timKiem,tuNgay,denNgay,trieuChung,truongHop,ketQuaMongMuon,benhChinh,benhDiKem;

	public String getTrieuChung() {
		return trieuChung;
	}



	public void setTrieuChung(String trieuChung) {
		this.trieuChung = trieuChung;
	}



	public String getTruongHop() {
		return truongHop;
	}



	public void setTruongHop(String truongHop) {
		this.truongHop = truongHop;
	}



	public String getKetQuaMongMuon() {
		return ketQuaMongMuon;
	}



	public void setKetQuaMongMuon(String ketQuaMongMuon) {
		this.ketQuaMongMuon = ketQuaMongMuon;
	}



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






	public String getBenhChinh() {
		return benhChinh;
	}



	public void setBenhChinh(String benhChinh) {
		this.benhChinh = benhChinh;
	}



	public String getBenhDiKem() {
		return benhDiKem;
	}



	public void setBenhDiKem(String benhDiKem) {
		this.benhDiKem = benhDiKem;
	}



	@Test
	public void lap_ho_so_kham_benh() {
		//given
		login.LoginPass();
		//when
		hoSo.click_lb_hoSoKhamBenh();
		hoSo.enter_phongKham(phongKham);
		hoSo.enter_trangThai(trangThai);
		hoSo.enter_tuNgay(tuNgay);
		hoSo.enter_denNgay(denNgay);
		hoSo.click_btn_search();
		hoSo.double_click_first_patient();
		hoSo.enter_trieuChung(trieuChung);
		hoSo.enter_benhChinh(benhChinh);
		hoSo.enter_benhDiKem(benhDiKem);
		hoSo.click_submit();
		//then
		hoSo.assertTrue(truongHop,ketQuaMongMuon);
		
		

}
}

