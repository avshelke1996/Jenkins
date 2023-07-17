package utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ltim.practise2.BaseTest;

public class HandleDropDown extends BaseTest {

	public static void selectByIndex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}

	public static void selectByVisibleText(WebElement wb, String text) {
		new Select(wb).selectByVisibleText(text);
	}

	public static String verifySelectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static void printAllValue(WebElement wb) {
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) {
			System.out.println(abc.getText());
		}
	}

	public static void checkSpecificValue(WebElement wb, String value) {
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) {
			if (abc.getText().equals(value))
				;
			{
				System.out.println("Value is present " + abc.getText());
			}
		}
	}

	public static void selectValue(List<WebElement> ls, String value) {
		for (WebElement abc : ls) {
			String a = abc.getText();

			if (a.equals(value)) {
				abc.click();
				break;
			}
		}
	}

}
