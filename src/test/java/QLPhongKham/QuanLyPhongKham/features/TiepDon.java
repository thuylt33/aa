package QLPhongKham.QuanLyPhongKham.features;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import QLPhongKham.QuanLyPhongKham.steps.serenity.TiepDonSteps;
import QuanLyPhongKham.Common.Datapool;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTagValuesOf;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="template/TiepDon.csv") 
@WithTagValuesOf({"feature:TiepDon"})
public class TiepDon {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	TiepDonSteps tiepDon;
	@Steps
	Login login;
	private String maBN,hoTen,gioiTinh,ngaySinh,namSinh,diaChi,maXaQuanTinh,xaQuanTinh,dienThoai,ngayDK,dkNgoaiGio,doiTuong,soTiepNhan,STT_kham,loaiKham,diaChiThe	,tuNgay	,denNgay	,du5Nam,khuVuc
	,dichVu,phongKham,dichVuYC,bacSiYeuCau,lyDoKham,dk_KCBBD,soBHYT,kThe,capCuu,noiKhacDen,benhVien,tuyen,danToc	,quocGia,ngheNghiep,soCMND,giayKhaiSinh,choLam,nguoiThan,quanHe,dienThoaiLienHe,	diaChiLienHe,ketQuaMongMuon,truongHop;

	
	
	public String getDk_KCBBD() {
		return dk_KCBBD;
	}
	public void setDk_KCBBD(String dk_KCBBD) {
		this.dk_KCBBD = dk_KCBBD;
	}
	public String getKetQuaMongMuon() {
		return ketQuaMongMuon;
	}
	public void setKetQuaMongMuon(String ketQuaMongMuon) {
		this.ketQuaMongMuon = ketQuaMongMuon;
	}
	public String getMaBN() {
		return maBN;
	}
	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getMaXaQuanTinh() {
		return maXaQuanTinh;
	}
	public void setMaXaQuanTinh(String maXaQuanTinh) {
		this.maXaQuanTinh = maXaQuanTinh;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getXaQuanTinh() {
		return xaQuanTinh;
	}
	public void setXaQuanTinh(String xaQuanTinh) {
		this.xaQuanTinh = xaQuanTinh;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getNgayDK() {
		return ngayDK;
	}
	public void setNgayDK(String ngayDK) {
		this.ngayDK = ngayDK;
	}
	public String getDkNgoaiGio() {
		return dkNgoaiGio;
	}
	public void setDkNgoaiGio(String dkNgoaiGio) {
		this.dkNgoaiGio = dkNgoaiGio;
	}
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public String getSoTiepNhan() {
		return soTiepNhan;
	}
	public void setSoTiepNhan(String soTiepNhan) {
		this.soTiepNhan = soTiepNhan;
	}
	public String getSTT_kham() {
		return STT_kham;
	}
	public void setSTT_kham(String sTT_kham) {
		STT_kham = sTT_kham;
	}
	public String getLoaiKham() {
		return loaiKham;
	}
	public void setLoaiKham(String loaiKham) {
		this.loaiKham = loaiKham;
	}
	public String getDiaChiThe() {
		return diaChiThe;
	}
	public void setDiaChiThe(String diaChiThe) {
		this.diaChiThe = diaChiThe;
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
	public String getDu5Nam() {
		return du5Nam;
	}
	public void setDu5Nam(String du5Nam) {
		this.du5Nam = du5Nam;
	}
	public String getKhuVuc() {
		return khuVuc;
	}
	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}
	public String getDichVu() {
		return dichVu;
	}
	public void setDichVu(String dichVu) {
		this.dichVu = dichVu;
	}
	public String getPhongKham() {
		return phongKham;
	}
	public void setPhongKham(String phongKham) {
		this.phongKham = phongKham;
	}
	public String getDichVuYC() {
		return dichVuYC;
	}
	public void setDichVuYC(String dichVuYC) {
		this.dichVuYC = dichVuYC;
	}
	public String getBacSiYeuCau() {
		return bacSiYeuCau;
	}
	public void setBacSiYeuCau(String bacSiYeuCau) {
		this.bacSiYeuCau = bacSiYeuCau;
	}
	public String getLyDoKham() {
		return lyDoKham;
	}
	public void setLyDoKham(String lyDoKham) {
		this.lyDoKham = lyDoKham;
	}
	public String getSoBHYT() {
		return soBHYT;
	}
	public void setSoBHYT(String soBHYT) {
		this.soBHYT = soBHYT;
	}
	public String getkThe() {
		return kThe;
	}
	public void setkThe(String kThe) {
		this.kThe = kThe;
	}
	public String getCapCuu() {
		return capCuu;
	}
	public void setCapCuu(String capCuu) {
		this.capCuu = capCuu;
	}
	public String getNoiKhacDen() {
		return noiKhacDen;
	}
	public void setNoiKhacDen(String noiKhacDen) {
		this.noiKhacDen = noiKhacDen;
	}
	public String getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(String benhVien) {
		this.benhVien = benhVien;
	}
	public String getTuyen() {
		return tuyen;
	}
	public void setTuyen(String tuyen) {
		this.tuyen = tuyen;
	}
	public String getDanToc() {
		return danToc;
	}
	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getGiayKhaiSinh() {
		return giayKhaiSinh;
	}
	public void setGiayKhaiSinh(String giayKhaiSinh) {
		this.giayKhaiSinh = giayKhaiSinh;
	}
	public String getChoLam() {
		return choLam;
	}
	public void setChoLam(String choLam) {
		this.choLam = choLam;
	}
	public String getNguoiThan() {
		return nguoiThan;
	}
	public void setNguoiThan(String nguoiThan) {
		this.nguoiThan = nguoiThan;
	}
	public String getQuanHe() {
		return quanHe;
	}
	public void setQuanHe(String quanHe) {
		this.quanHe = quanHe;
	}
	public String getDienThoaiLienHe() {
		return dienThoaiLienHe;
	}
	public void setDienThoaiLienHe(String dienThoaiLienHe) {
		this.dienThoaiLienHe = dienThoaiLienHe;
	}
	public String getDiaChiLienHe() {
		return diaChiLienHe;
	}
	public void setDiaChiLienHe(String diaChiLienHe) {
		this.diaChiLienHe = diaChiLienHe; 
	}
	public void setCase(String truongHop) {
		this.truongHop = truongHop; 
	}
	
	
	 
	@Test
	public void TiepDonBenhNhan(){
		//given
		login.LoginPass();
		//when
		tiepDon.click_lb_tiepDon();
		
		//then
		tiepDon.addPatient_To_Receive(dk_KCBBD,tuNgay,denNgay,soBHYT,maXaQuanTinh,xaQuanTinh,dienThoai,dichVu,phongKham,diaChiLienHe,nguoiThan,quanHe,dienThoaiLienHe,hoTen,gioiTinh,ngaySinh,namSinh,diaChi,ngayDK,doiTuong);
		tiepDon.assertTrue(ketQuaMongMuon, truongHop);
	}
	
}
