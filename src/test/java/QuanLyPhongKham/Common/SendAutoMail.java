package QuanLyPhongKham.Common;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SendAutoMail {

	public class Constants {
		 
		  
		  public static final String MY_EMAIL = "hangnt51@viettel.com.vn";
		  
		  public static final String MY_PASSWORD ="Stupid@2019";
		 
		   public static final String FRIEND_EMAIL = "hangnt51@viettel.com.vn";  
		}

	public static void sendEmail() {
		try {            
			Email email = new SimpleEmail();

			// Cấu hình thông tin Email Server
			email.setHostName("smtp.viettel.com.vn");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator(Constants.MY_EMAIL,
					Constants.MY_PASSWORD));

			// Với gmail cái này là bắt buộc.
			email.setSSLOnConnect(true);

			// Người gửi
			email.setFrom(Constants.MY_EMAIL);

			// Tiêu đề
			email.setSubject("Báo lỗi auto từ hệ thống khám sức khỏe");

			// Nội dung email
			email.setMsg("Tài khoản 56z01_admin không login được vào hệ thống");

			// Người nhận
			email.addTo(Constants.FRIEND_EMAIL);            
			email.send();
			System.out.println("Sent!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}