package com.Utility;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	public String getSelectedValue(WebElement element) {
		Select sel = new Select(element);
		String value = sel.getFirstSelectedOption().getText();
		return value;

	}

	public static void selectbyText(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectbyValue(String value, WebElement element) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectbyIndex(int index, WebElement element) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void deselectbyIndex(int index, WebElement element) {
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}

	public void deselectbyValue(String value, WebElement element) {
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}

	public void deselectbyText(String text, WebElement element) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}

	public List<String> getAllDropDownValues(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> elementList = sel.getOptions();
		List<String> valueList = new LinkedList<String>();

		for (WebElement ele : elementList) {
			valueList.add(ele.getText());
		}
		return valueList;
	}
	public static void selectRadioByValue(List<WebElement> radioList, String text) {

		for (WebElement list : radioList) {
			String value = list.getAttribute("value");
			if (value.equals(text)) {
				list.click();
				break;
			}
		}
	}

	public static void selectCheckBoxByValue(List<WebElement> checkBoxes, List<String> values) {
		for (String value : values) {
			for (WebElement checkBox : checkBoxes) {
				if (checkBox.getAttribute("value").equals(value)) {
					checkBox.click();
					break;
				}
			}
		}
	}
	public static void selectMultipleValueByText(WebElement element, List<String> values) {
		Select sele = new Select(element);
		if (sele.isMultiple()) {
			List<WebElement> options = sele.getOptions();
			for (String value : values) {
				for (WebElement option : options) {
					if (option.getText().equals(value)) {
						sele.selectByVisibleText(value);
					}
				}
			}
		}
	}
}
