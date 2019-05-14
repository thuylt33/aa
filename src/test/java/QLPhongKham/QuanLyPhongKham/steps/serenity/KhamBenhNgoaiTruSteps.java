package QLPhongKham.QuanLyPhongKham.steps.serenity;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import QLPhongKham.QuanLyPhongKham.features.TiepDon;
import QLPhongKham.QuanLyPhongKham.pages.KhambenhNgoaiTruPage;
import net.thucydides.core.annotations.Step;

public class KhamBenhNgoaiTruSteps {
	KhambenhNgoaiTruPage khamBenh;


	@Step
	public void click_lb_khambenhngoaitru() {
		// TODO Auto-generated method stub
		khamBenh.the_page_load_already();
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
	public void assertTrue_search_Patient(String maYTe,String trangThai,String phongKham,String tuNgay,String denNgay) throws ParseException {
		// TODO Auto-generated method stub
		//so sánh mảng các  trường trên web trong bảng với diều kiện so sánh
		int row_in_page1=khamBenh.getRowResult();
		if(row_in_page1>0) {
			do {
				System.out.println("dang ckeck page");

				int row =khamBenh.getRowResult();
				List<Map<String, String>> map = new ArrayList<Map<String, String>>();

				for(int i = 0; i < row; i++) {
					map.add(new LinkedHashMap<String, String>());
				}

				for(int i=0;i<row;i++) {
					map.get(i).put("Trạng thái", khamBenh.getValue_trangThai(i+1));
					map.get(i).put("Ngày yêu cầu", khamBenh.getValue_NgayDK(i+1));
					map.get(i).put("Phòng khám", khamBenh.getValue_phongKham(i+1));
					map.get(i).put("Mã y tế", khamBenh.getValue_maYte(i+1));
				}

				for(int i=0;i<row;i++) {
					//System.out.println(trangThai+"      "+map.get(i).get("Trạng thái").subSequence(1, map.get(i).get("Trạng thái").length()));
					if(!trangThai.equals("")) {
						//	System.out.println("đang ckeck trường trạng thái");
						assertTrue(trangThai.contains(map.get(i).get("Trạng thái").subSequence(1, map.get(i).get("Trạng thái").length())));
					}

					if(!tuNgay.equals("")) {
						//	System.out.println("đang ckeck trường ngày phải nằm giữa  từ ngày- denngay");

						Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(tuNgay);
						Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(denNgay);
						Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(map.get(i).get("Ngày yêu cầu"));
						assertTrue(date3.compareTo(date2)<=0 && date3.compareTo(date1)>=0);

					}
					if(!maYTe.equals("")) {
						//	System.out.println("đang ckeck mã y tế");
						assertTrue(map.get(i).get("Mã y tế").equals(maYTe));
					}

				}
				System.out.println("đã ckeck xong page 1");
				if(khamBenh.btn_next_page_isDisplayed()>0) {
					khamBenh.click_nextPage();
				}
			}while(khamBenh.btn_next_page_isDisplayed()>0);
		}
		System.out.println("Ckeck Tìm kiếm thành công");

	}



	public void enter_tuNgay(String tuNgay) {
		// TODO Auto-generated method stub
		khamBenh.enter_tuNgay(tuNgay);

	}


	public void enter_denNgay(String denNgay) {
		// TODO Auto-generated method stub
		khamBenh.enter_denNgay(denNgay);
	}


}
