package QLPhongKham.QuanLyPhongKham.pages;

import java.util.ArrayList;
import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import QuanLyPhongKham.Common.Util;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://10.60.108.139:8010/")
public class TiepDonPage extends PageObject {


	@FindBy(id="tiepnhan_mabenhvien")
	private WebElementFacade lb_maBenhVien;

	@FindBy(xpath="//*[@class='x-grid-cell x-grid-td x-grid-cell-gridcolumn-1015 x-grid-cell-first x-unselectable ']//div[@class='x-grid-cell-inner ']")
	private WebElementFacade span_luuThanhCong;

	@FindBy(id="tiepnhan_index_cb_doituong-inputEl")
	private WebElementFacade lb_doiTuong;

	@FindBy(id="tiepnhan_index_cb_CoCongKham-inputEl")
	private WebElementFacade lb_loaiKham;

	@FindBy(id="tiepnhan_date_ngaydangky-inputEl")
	private WebElementFacade lb_ngayKham;

	@FindBy(id="tiepnhan_tqx_viettat")
	private WebElementFacade input_maQuanTinh;

	private By select_xaQuanTinh(String xaQuanTinh) {
		return By.xpath("//div[contains(text(),'"+xaQuanTinh+"')]");

	}

	@FindBy(xpath="//*[@id='tiepnhan_index_cb_phongkham-inputCell']/parent::tr//td[@class=' x-trigger-cell x-unselectable']")
	private WebElementFacade lb_phongKham_dropdown;

	@FindBy(id="tiepnhan_index_cb_dichvu-inputEl")
	private WebElementFacade lb_dichVu;

	@FindBy(id="tiepnhan_cbx_tqx_ten-inputEl")
	private WebElementFacade input_xaQuanTinh;

	@FindBy(id="tiepnhan_index_cb_gioitinh-inputEl")
	private WebElementFacade lb_gioiTinh;

	@FindBy(id="tiepnhan_cbx_tqx_ten-inputEl")
	private WebElementFacade lb_diaChi;

	@FindBy(id="tiepnhan_date_ngaydangky-inputEl")
	private WebElementFacade lb_ngayDk;

	@FindBy(id="tiepnhan_index_cb_dantoc-inputEl")
	private WebElementFacade lb_danToc;

	@FindBy(id="tiepnhan_index_cb_quocgia-inputEl")
	private WebElementFacade lb_quocGia;

	@FindBy(id="tiepnhan_index_cb_nghenghiep-inputEl")
	private WebElementFacade lb_ngheNghiep;

	@FindBy(id="tiepnhan_index_cb_phongkham-inputEl")
	private WebElementFacade lb_phongKham;

	@FindBy(id="tiepnhan_hoten")
	private WebElementFacade input_hoVaTen;


	@FindBy(id="tiepnhan_namsinh")
	private WebElementFacade input_namSinh;

	@FindBy(id="tiepnhan_date_ngaysinh-inputEl")
	private WebElementFacade input_ngaySinh;

	@FindBy(xpath="//*[@id='tiepnhan_index_cb_doituong-inputCell']/parent::tr//div[@role='button']")
	private WebElementFacade drop_down_doiTuong;

	@FindBy(id="tiepnhan_sonha_duong")
	private WebElementFacade input_diaChi;

	@FindBy(xpath="//div[@id='msg-div']//label[@class='msg-classtemp']")
	private WebElementFacade span_thongBao;

	@FindBy(id="tiepnhan_cbx_benhnhan_timkiem-inputEl")
	private WebElementFacade input_Search_Name;

	@FindBy(id="tiepnhan_nguoilh_hoten")
	private WebElementFacade input_nguoiThan;

	@FindBy(id="tiepnhan_nguoilh_quanhe")
	private WebElementFacade input_quanHe;
	@FindBy(xpath="//a[@href='#tiepnhanbenhnhan_thongtinbaohiem']/parent::span")
	private WebElementFacade span_TTBH;

	@FindBy(xpath="//a[@href='#tiepnhanbenhnhan_thongtinnangcao']/parent::span")
	private WebElementFacade span_TTNC;

	@FindBy(id="tiepnhan_nguoilh_dienthoai")
	private WebElementFacade input_dienThoaiLienHe;

	private By select_gioiTinh(String gioiTinh) {
		return By.xpath("//*[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//li[contains(text(),'"+gioiTinh+"')]");

	}
	private By lb_patient_search(String name) {
		return By.xpath("//td[contains(text(),'"+name+"')]");

	}
	private By select_doiTuong(String doiTuong) {
		return By.xpath("//div[contains(text(),'"+doiTuong+"')]");

	}
	private By select_dichVu(String dichVu) {
		return By.xpath("//div[contains(text(),'"+dichVu+"')]");

	}
	private By select_phongKham(String phongKham) {
		return By.xpath("//div[contains(text(),'"+phongKham+"')]");

	}

	@FindBy(id="tiepnhan_nguoilh_diachi")
	private WebElementFacade input_diaChiLienHe;

	@FindBy(id="tiepnhan_mathebhyt")
	private WebElementFacade input_soBHYT;

	@FindBy(id="tiepnhan_dienthoai")
	private WebElementFacade input_soDienThoai;

	@FindBy(id="tiepnhan_bt_save")
	private WebElementFacade span_luu;

	@FindBy(id="tiepnhan_noidangky_kcbbd_code")
	private WebElementFacade input_dk_KCBBD;

	@FindBy(id="tiepnhan_date_bh_tungay-inputEl")
	private WebElementFacade input_tuNgay;

	@FindBy(id="tiepnhan_date_bh_denngay-inputEl")
	private WebElementFacade input_denNgay;

	public String getMaBenhNhan() {
		// TODO Auto-generated method stub
		return lb_maBenhVien.getAttribute("value");

	}

	public String getDoiTuong() {
		// TODO Auto-generated method stub
		return lb_doiTuong.getAttribute("value");

	}
	public String getLoaiKham() {
		return lb_loaiKham.getAttribute("value");
	}
	public String getNgayKham() {
		return lb_ngayKham.getAttribute("value");
	}
	public String getDichVu() {
		return lb_dichVu.getAttribute("value");
	}
	public String  getGioiTinh() {
		return lb_gioiTinh.getAttribute("value");
	}
	public String  getDiaChi() {
		return lb_diaChi.getAttribute("value");
	}

	public String getNgayDK() {
		// TODO Auto-generated method stub
		return lb_ngayDk.getAttribute("value");
	}

	public String getphongKham() {
		// TODO Auto-generated method stub
		return lb_phongKham.getAttribute("value");
	}



	public String getDanToc() {
		// TODO Auto-generated method stub
		return lb_danToc.getAttribute("value");
	}

	public String getQuocGia() {
		// TODO Auto-generated method stub
		return lb_quocGia.getAttribute("value");
	}

	public Object getNgheNghiep() {
		// TODO Auto-generated method stub
		return lb_ngheNghiep.getAttribute("value");
	}

	public void enter_hoVaTen(String hoVaTen) {
		// TODO Auto-generated method stub
		input_hoVaTen.type(hoVaTen);



	}

	public void enter_ngaySinh(String ngaySinh) {
		// TODO Auto-generated method stub
		input_ngaySinh.type(ngaySinh);
		input_ngaySinh.sendKeys(Keys.chord(Keys.ENTER));

	}


	public void enter_GioiTinh(String gioiTinh) {
		// TODO Auto-generated method stub
		lb_gioiTinh.click();
		try {
			Thread.sleep(500);
			this.getDriver().findElement(select_gioiTinh(gioiTinh)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void enter_namSinh(String namSinh) {
		// TODO Auto-generated method stub
		input_namSinh.type(namSinh);
	}

	public void enter_diaChi(String diaChi) {
		// TODO Auto-generated method stub
		waitForAngularRequestsToFinish();
		input_diaChi.type(diaChi);

	}

	public void enter_ngayDangKi(String ngayDK) {
		// TODO Auto-generated method stub
		lb_ngayDk.clear();
		lb_ngayDk.type(ngayDK); 

	}

	public void enter_doiTuong(String doiTuong) {
		// TODO Auto-generated method stub
		drop_down_doiTuong.click();
		try {
			Thread.sleep(500);

			this.getDriver().findElement(select_doiTuong(doiTuong)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	public boolean span_Luu_is_displayed() {
		return span_luuThanhCong.isDisplayed();

	}
	public String getTextThongBao() {


		return 	span_thongBao.getText();
	}
	public boolean span_thongBaoError_is_displayed() { 
		return span_thongBao.isDisplayed(); 
	}
	public String getTextThongBao_LuuThanhCong() {
		// TODO Auto-generated method stub
		return span_luuThanhCong.getText();
	}
	public void click_span_Luu() {
		// TODO Auto-generated method stub
		span_luu.click();

	}
	public void enter_nguoiThan(String nguoiThan) {
		// TODO Auto-generated method stub
		input_nguoiThan.type(nguoiThan);
	}
	public void enter_quanHe(String quanHe) {
		// TODO Auto-generated method stub
		input_quanHe.type(quanHe);


	}
	public void enter_dienThoaiLienHe(String dienThoaiLienHe) {
		// TODO Auto-generated method stub
		input_dienThoaiLienHe.type(dienThoaiLienHe);

	}
	public void enter_diaChiLienHe(String diaChiLienHe) {
		// TODO Auto-generated method stub
		input_diaChiLienHe.type(diaChiLienHe);

	}
	public void enter_dichVu(String dichVu) {
		// TODO Auto-generated method stub
		lb_dichVu.click();

		this.getDriver().findElement(select_dichVu(dichVu)).click();

	}
	public void enter_phongKham(String phongKham) {
		// TODO Auto-generated method stub
		lb_phongKham_dropdown.click();

		this.getDriver().findElement(select_phongKham(phongKham)).click();

	}
	public void enter_soDienThoai(String soDienThoai) {
		// TODO Auto-generated method stub
		input_soDienThoai.type(soDienThoai);
	}
	public void enter_maXaQuanTinh(String maQuanTinh) {
		// TODO Auto-generated method stub
		input_maQuanTinh.type(maQuanTinh);

	}
	public void enter_xaQuanTinh(String xaQuanTinh) {
		// TODO Auto-generated method stub
		input_xaQuanTinh.click();
		input_xaQuanTinh.type(xaQuanTinh);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getDriver().findElement(By.xpath("//ul[@class='x-list-plain']/li")).click();

	}
	public void click_span_TTBH() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		span_TTBH.click();

	}
	public void click_span_TTNC() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		span_TTNC.click();

	}
	public void enter_Search_Name(String name) {
		// TODO Auto-generated method stub
		input_Search_Name.type(name);

	}
	public void enter_soBHYT(String soBHYT) {
		// TODO Auto-generated method stub
		String soBHYT_random=soBHYT+ Util.getUniqueCode().subSequence(0, 10);
		
		System.out.println(Util.getUniqueCode());
		
		input_soBHYT.type(soBHYT_random);
	}
	public void is_DisplayPatent_new(String hoTen_Unicode) {
		// TODO Auto-generated method stub
		this.getDriver().findElement(lb_patient_search(hoTen_Unicode)).isDisplayed();

	}
	public void enter_dk_KCBBD(String dk_KCBBD) {
		// TODO Auto-generated method stub
		input_dk_KCBBD.type(dk_KCBBD);
		

	}
	public void enter_tuNgay(String tuNgay) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input_tuNgay.type(tuNgay);

	}
	public void enter_denNgay(String denNgay) {
		// TODO Auto-generated method stub
		input_denNgay.type(denNgay);

	}

}
