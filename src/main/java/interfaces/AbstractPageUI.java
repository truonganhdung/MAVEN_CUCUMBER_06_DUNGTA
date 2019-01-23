package interfaces;

public class AbstractPageUI {
	public static final String DYNAMIC_PAGE_LINK = "//a[text()='%s']";

	public static final String DYNAMIC_TEXTBOX = "//td[contains(text(),'%s')]/following-sibling::td/input";
	
	public static final String DYNAMIC_TEXTBOX_CUCUMBER = "//input[@name='%s'";
	public static final String DYNAMIC_TEXTAREA_CUCUMBER = "//textarea[@name='%s'";
	public static final String DYNAMIC_DROPDOWN_CUCUMBER = "//select[@name='%s'";
	public static final String DYNAMIC_MESSAGE_CUCUMBER = "//p[@class='heading3' and text()='%s'";
	public static final String DYNAMIC_BUTTON_CUCUMBER = "//input[@value='%s'";
	public static final String DYNAMIC_DATA_CUCUMBER = "//td[text()='%s']/following-sibling::td";
	
	public static final String SUBMIT_BUTTON = "//input[@type='submit']";
	
	public static final String DYNAMIC_VERIFY = "//td[text()='%s']/following-sibling::td";
	
}
