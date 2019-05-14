package QuanLyPhongKham.Common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
	public static void coppyPaste(String textCoppy) throws InterruptedException {
		Robot robot;
		try {
			robot = new Robot(); 
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection stringSelection = new StringSelection(textCoppy);

			clipboard.setContents(stringSelection, null);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void setKey(int key) {
		// button Ky so
		try {
			Robot robot;
			robot = new Robot();
			robot.setAutoDelay(50);
			robot.keyPress(key);
			robot.keyRelease(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param driver
	 * @param key
	 * @throws Exception
	 */
	public static void sendFunctionKey(WebDriver driver, Keys key) throws Exception {
		driver.switchTo().activeElement().sendKeys(key);
	}

	/**
	 * Su dung khi khong bat duoc doi tuong
	 * 
	 * @param driver
	 * @param text
	 * @throws Exception
	 */
	public static void sendKey(WebDriver driver, String text) throws Exception {
		driver.switchTo().activeElement().sendKeys(text);
	}

	/**
	 * Thực hiện lệnh js
	 */
	public static void executeJS(WebDriver driver, String javascript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(javascript);
		

		 
	}
	public static void scrollToElement(WebDriver driver, WebElement a) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;

	jse.executeScript("arguments[0].scrollIntoView()", a);
	}
	/**
	 * using robot api, choose a file, press enter
	 * 
	 * @param path
	 */
	public static void chooseUploadFile(String path) {
		String autoITExecutable = ".\\uploadFile_chrm.exe " + path;
		try {
			Runtime.getRuntime().exec(autoITExecutable);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Scroll down
	 */
	public static void scrollDown(WebDriver driver, int i) {
		executeJS(driver, "window.scrollBy(0," + i + ")");
	}

	/**
	 * return unique code
	 */
	public static String getUniqueCode() {
		Date d = new Date();
		return String.valueOf(d.getTime());
	}

	/**
	 * Hàm lấy ngày cách value ngày/tháng/năm so với ngày hiện tại
	 * value > 0 lấy thời điểm trong tương lại,
	 * value < 0 lấy thời điểm trong quá khứ
	 * 
	 * @param type: theo ngày, tháng, năm
	 * @param value: số ngày/tháng/năm cách thời điểm hiện tại muốn lấy.  
	 * @param format: định dạng hiển thị của ngày trả về
	 * @return
	 */
	public static String getDay(String type, int value, String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Calendar cal = Calendar.getInstance();
		Date date2 = null;
		switch (type) {
		case "day":
			cal.add(Calendar.DATE, value);
			date2 = cal.getTime();
			break;
		case "month":
			cal.add(Calendar.MONTH, value);
			date2 = cal.getTime();
			break;
		case "year":
			cal.add(Calendar.YEAR, value);
			date2 = cal.getTime();
			break;
		default:
			break;
		}
		return dateFormat.format(date2);
	}
	
	public static String getDayCurent() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Date date = new Date();
		return sdf.format(date).toString();
	}
	
	@Test
	public void compare_Date(String fromDate,String toDate,String date_Compare) throws ParseException {
		fromDate="31/11/1998";  
		toDate="31/12/1998";
		date_Compare="15/12/1998";
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
		    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
		    Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(date_Compare);
		    System.out.println(date1);  
	}
	
}
