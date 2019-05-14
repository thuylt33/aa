

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import QLPhongKham.QuanLyPhongKham.features.Login;
import QLPhongKham.QuanLyPhongKham.steps.serenity.TiepDonSteps;
import QuanLyPhongKham.Common.Datapool;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTagValuesOf;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
@RunWith(SerenityRunner.class)
@UseTestDataFrom(value="template/TiepDon.csv") 
@WithTagValuesOf({"feature:TiepDon"})
public class test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	TiepDonSteps tiepDon;
	@Steps
	Login login;
	
	public void TiepDonBenhNhan() throws Exception{
		ArrayList object = Datapool.readDatapool("template/TiepDon.xlsx","TiepDon");
		//given
		login.LoginPass();
		for (int i = 0; i < object.size(); i++) {

			LinkedHashMap<String, String> data = (LinkedHashMap<String, String>) object.get(i);

			//when
			tiepDon.click_lb_tiepDon();

			//then
			//tiepDon.addPatient_To_Receive(data.get("maXaQuanTinh"),data.get("xaQuanTinh"),data.get("dienThoai"),data.get("dichVu"),data.get("phongKham"),data.get("diaChiLienHe"),data.get("nguoiThan"),data.get("quanHe"),data.get("dienThoaiLienHe"),data.get("hoTen"),data.get("gioiTinh"),data.get("ngaySinh"),data.get("namSinh"),data.get("diaChi"),data.get("ngayDK"),data.get("doiTuong"));
			//tiepDon.assertTrue(data.get("ketQuaMongMuon"), data.get("truongHop"),data.get("hoTen"));
		}

	}

	@Test
	public void compare() {
		String a="Chờ khám";
		String b="Chờ khám bệnh, chờ kết luận";
		assertTrue(a.contains(b));
	}



}
