package utility;

import ltim.practise2.BaseTest;

public class HandleAlert extends BaseTest {

	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();

	}
	
	public static void clickOnCancelButton() {
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureText() {
		return driver.switchTo().alert().getText();
	}
	
	public static void sendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}



}
