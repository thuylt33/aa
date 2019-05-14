import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)
public class dsdsd {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Test
	public void compare_Date(String fromDate,String toDate,String date_Compare) {
		fromDate="31/11/1998";  
		toDate="31/12/1998";
		date_Compare="15/12/1998";
		Date date1,date2,date3;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
			date2=new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
			 date3=new SimpleDateFormat("dd/MM/yyyy").parse(date_Compare);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//	System.out.println(date1);  
	}
}
