package QLPhongKham.QuanLyPhongKham.steps.serenity;


import org.junit.Assert;

import QLPhongKham.QuanLyPhongKham.pages.HoSoKhamBenhPage;
import QLPhongKham.QuanLyPhongKham.pages.HomePage;
import QLPhongKham.QuanLyPhongKham.pages.KhambenhNgoaiTruPage;
import QLPhongKham.QuanLyPhongKham.pages.TiepDonPage;
import QuanLyPhongKham.Common.Util;
import net.thucydides.core.annotations.Step;

public class HoSoKhamBenhSteps {
	KhambenhNgoaiTruPage khamBenh;
	TiepDonPage tiepDon;
	HoSoKhamBenhPage hoSo;
	HomePage home;
	String id_benhNhan,search_date;


	@Step
	public void click_lb_hoSoKhamBenh() {
		// TODO Auto-generated method stub
		khamBenh.click_lb_khambenh();

	}


	@Step
	public void enter_phongKham(String phongKham) {
		// TODO Auto-generated method stub
		khamBenh.click_dropdown_phongKham();
		khamBenh.click_phongKham(phongKham);

	}


	@Step
	public void enter_trangThai(String trangThai) {
		// TODO Auto-generated method stub
		khamBenh.click_dropdown_TrangThai();
		khamBenh.click_trangThai(trangThai);

	}


	@Step
	public void enter_id_benhNhan(String idBenhNhan) {
		// TODO Auto-generated method stub
		khamBenh.enterID_Patient(idBenhNhan);

	}


	@Step
	public void click_btn_search() {
		// TODO Auto-generated method stub
		khamBenh.click_btn_search();
	}



	@Step
	public void enter_tuNgay(String tuNgay) {
		// TODO Auto-generated method stub
		khamBenh.enter_tuNgay(tuNgay);

	}

	@Step
	public void enter_denNgay(String denNgay) {
		// TODO Auto-generated method stub
		khamBenh.enter_denNgay(denNgay);
	}

	@Step
	public void double_click_first_patient() {
		// TODO Auto-generated method stub
		id_benhNhan=khamBenh.getText_ID_patient();

		search_date=khamBenh.getText_Ngay();

		khamBenh.double_click_first_patient();;

	}
	@Step
	public void get_ID_patient() {
		khamBenh.getText_ID_patient();
	}

	@Step
	public void enter_trieuChung(String trieuChung) {
		// TODO Auto-generated method stub
		khamBenh.enter_trieuChung(trieuChung);

	}

	@Step
	public void assertTrue(String _case, String ketQuaMongMuon) {
		// TODO Auto-generated method stub
		if(_case.equals("fail")) {
			System.out.println(tiepDon.getTextThongBao());
			Assert.assertTrue(tiepDon.getTextThongBao().equals(ketQuaMongMuon));
		}
		if(_case.equals("pass")) {

			//Tìm kiếm theo trạng thái , ngày, id bệnh nhân

			home.go_to_search_patient();
			enter_trangThai("Đã khám bệnh");
			khamBenh.search_By_clinic_va_id_patient_va_date(id_benhNhan,search_date);

			//Kiểm tra xem có đúng 1 bản ghi không
			Assert.assertTrue(khamBenh.the_patient_is_examined());

		}
	}


	public void click_submit() {
		// TODO Auto-generated method stub
		hoSo.click_span_Luu();

	}

	@Step
	public void enter_benhChinh(String benhChinh) {
		// TODO Auto-generated method stub
		hoSo.enter_benhChinh(benhChinh);

	}


	public void enter_benhDiKem(String benhDiKem) {
		// TODO Auto-generated method stub
		hoSo.enter_benhDiKem(benhDiKem);

	}


}
