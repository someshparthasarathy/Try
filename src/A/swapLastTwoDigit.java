package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swapLastTwoDigit {

	public static void main(String[] args) {
		int num=12345;
		int lasttwodigit=num%100;
		int finalnumber=num/100;
		int res=(finalnumber*100)+(lasttwodigit%10)*10+(lasttwodigit/10);
		System.out.println(res);
		
	}
}
