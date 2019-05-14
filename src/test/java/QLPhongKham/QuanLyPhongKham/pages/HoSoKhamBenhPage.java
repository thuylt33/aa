package QLPhongKham.QuanLyPhongKham.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Key;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://10.60.108.139:8010/")
public class HoSoKhamBenhPage extends PageObject {

	// TODO Auto-generated method stub
	@FindBy(id="btn_khambenh_luuhosokhambenh")
	private WebElementFacade span_save;

	@FindBy(id="token-input-id_frmMaChinhICD10")
	private WebElementFacade input_benhChinh;

	@FindBy(id="token-input-id_frmMaPhuICD10")
	private WebElementFacade input_benhDiKem;

	
	public void click_span_Luu() {
		// TODO Auto-generated method stub

		span_save.click();
	}


	public void enter_benhChinh(String benhChinh) {
		// TODO Auto-generated method stub
		input_benhChinh.type(benhChinh);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input_benhChinh.sendKeys(Keys.chord(Keys.ENTER));


	}


	public void enter_benhDiKem(String benhDiKem) {
		// TODO Auto-generated method stub
		
		input_benhDiKem.type(benhDiKem);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input_benhDiKem.sendKeys(Keys.chord(Keys.ENTER));



	}


	


}





