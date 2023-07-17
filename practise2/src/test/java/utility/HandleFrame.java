package utility;

import org.openqa.selenium.WebElement;

import ltim.practise2.BaseTest;

public class HandleFrame extends BaseTest {

	public static void frame(int index) {
		driver.switchTo().frame(index);
	}

	public static void frame(String idOrName) {
		driver.switchTo().frame(idOrName);
	}

	public static void frame(WebElement wb) {
		driver.switchTo().frame(wb);
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void topFrame() {
		driver.switchTo().defaultContent();
	}

}
