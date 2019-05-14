package QLPhongKham.QuanLyPhongKham.steps.serenity;

import java.util.ArrayList;

import org.jruby.ir.instructions.defined.GetDefinedConstantOrMethodInstr;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ibm.icu.impl.UResource.Array;

import QLPhongKham.QuanLyPhongKham.pages.HomePage;
import QLPhongKham.QuanLyPhongKham.pages.KhambenhNgoaiTruPage;
import QLPhongKham.QuanLyPhongKham.pages.TiepDonPage;
import QuanLyPhongKham.Common.Datapool;
import QuanLyPhongKham.Common.TiepDonDatapool;
import QuanLyPhongKham.Common.Util;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.junit.annotations.UseTestDataFrom;

/**
 * @author os-hiennt
 *
 */

public class TiepDonSteps {
	TiepDonPage tiepDon;
	HomePage home;
	KhambenhNgoaiTruPage khamBenh;
	Util util;
	Datapool testdata;
	String hoTen_Unicode="";
	@Step
	public void click_lb_tiepDon() {
		khamBenh.the_page_load_already();
		home.click_lb_TiepDon();
		tiepDon.click_span_TTNC();
		tiepDon.click_span_TTBH();

	}

	@Step
	public void ckeck_defalutValue() {
		// TODO Auto-generated method stub
		tiepDon.getMaBenhNhan().equals("56Z01");
		tiepDon.getDoiTuong().equals("Thu Phí");
		tiepDon.getLoaiKham().equals("Có khám bệnh");
		tiepDon.getGioiTinh().equals("Nam");
		tiepDon.getDichVu().equals("Khám Nội");
		tiepDon.getDiaChi().equals("TP. Nha Trang, Khánh Hoà");
		tiepDon.getNgayDK().equals(util.getDayCurent());
		tiepDon.getphongKham().equals("PB001 - PK Tổng Quát");
		tiepDon.getDanToc().equals("Kinh");
		tiepDon.getQuocGia().equals("Việt Nam");
		tiepDon.getNgheNghiep().equals("Khác");

	}

	@Step
	public void add_Attributes_Patient(String dk_KCBBD,String tuNgay,String denNgay,String soBHYT,String maQuanTinh, String xaQuanTinh, String soDienThoai, String dichVu,
			String phongKham, String diaChiLienHe, String nguoiThan, String quanHe, String dienThoaiLienHe,
			String hoTen, String gioiTinh, String ngaySinh, String namSinh, String diaChi, String ngayDK,
			String doiTuong) {

		if (!hoTen.equals("")) {
			hoTen_Unicode+=hoTen + Util.getUniqueCode();
			tiepDon.enter_hoVaTen(hoTen_Unicode);
			System.out.println("ho tên là: "+hoTen_Unicode);
		}
		if (!gioiTinh.equals("")) {
			tiepDon.enter_GioiTinh(gioiTinh);
		}
		if (!ngaySinh.equals("")) {
			tiepDon.enter_ngaySinh(ngaySinh);
		}
		if (!namSinh.equals("")) {
			tiepDon.enter_namSinh(namSinh);
		}
		if (!diaChi.equals("")) {
			tiepDon.enter_diaChi(diaChi);
		}
		if (!maQuanTinh.equals("")) {
			tiepDon.enter_maXaQuanTinh(maQuanTinh);
		}
		if (!soDienThoai.equals("")) {
			tiepDon.enter_soDienThoai(soDienThoai);
		}
		if (!ngayDK.equals("")) {
			tiepDon.enter_ngayDangKi(ngayDK);
		}
		if (!doiTuong.equals("")) {
			tiepDon.enter_doiTuong(doiTuong);
		}
		if (!dichVu.equals("")) {
			tiepDon.enter_dichVu(dichVu);
		}
		if (!phongKham.equals("")) {
			tiepDon.enter_phongKham(phongKham);
		}
		if (!nguoiThan.equals("")) {
			tiepDon.enter_nguoiThan(nguoiThan);
		}
		if (!quanHe.equals("")) {
			tiepDon.enter_quanHe(quanHe);
		}
		if (!dienThoaiLienHe.equals("")) {
			tiepDon.enter_dienThoaiLienHe(dienThoaiLienHe);
		}
		if (!diaChiLienHe.equals("")) {
			tiepDon.enter_diaChiLienHe(diaChiLienHe);
		}

		if(!soBHYT.equals("")) {
			tiepDon.enter_soBHYT(soBHYT);
		}
		if(!dk_KCBBD.equals("")) {
			tiepDon.enter_dk_KCBBD(dk_KCBBD);

		}
		if(!tuNgay.equals("")) {
			tiepDon.enter_tuNgay(tuNgay);
		}
		if(!denNgay.equals("")) {
			tiepDon.enter_denNgay(denNgay);
		}
	}
	@Step 
	public void click_span_luu() {
		tiepDon.click_span_Luu();
	}
	@Step
	public void addPatient_To_Receive(String dk_KCBBD,String tuNgay,String denNgay,String soBHYT,String maQuanTinh, String xaQuanTinh, String soDienThoai, String dichVu,
			String phongKham, String diaChiLienHe, String nguoiThan, String quanHe, String dienThoaiLienHe,
			String hoTen, String gioiTinh, String ngaySinh, String namSinh, String diaChi, String ngayDK,
			String doiTuong) {
		add_Attributes_Patient(dk_KCBBD,tuNgay,denNgay,soBHYT, maQuanTinh,xaQuanTinh,soDienThoai,dichVu,phongKham,diaChiLienHe,nguoiThan,quanHe,dienThoaiLienHe,hoTen,gioiTinh,ngaySinh,namSinh,diaChi,ngayDK,doiTuong);
		click_span_luu();
	}

	public void assertTrue(String ketQuaMongMuon, String _case) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if (_case.equals("fail")) {
			System.out.println(tiepDon.getTextThongBao());
			Assert.assertTrue(tiepDon.getTextThongBao().equals(ketQuaMongMuon));
			System.out.println("Thông báo: case validate");
		}else if (_case.contentEquals("pass")) {
			String upper_hoTen = hoTen_Unicode.toUpperCase();
			tiepDon.enter_Search_Name(upper_hoTen);
			tiepDon.is_DisplayPatent_new(upper_hoTen);
			System.out.println("Thông báo: ckeck case lưu thành công");
		} else {
			System.out.println("Thông báo: Không giống với kết quả mong muốn");
			assert false;
		}

	}

	public void click_span_thongTinBaoHiem() {
		// TODO Auto-generated method stub
		tiepDon.click_span_TTBH();

	}

	public void click_span_thongTinNangCao() {
		// TODO Auto-generated method stub
		tiepDon.click_span_TTNC();

	}

}
