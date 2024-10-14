package com.Hrms.pages;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;

public class PIMPage{
	// Web locators

	private final static By by_pim = By.xpath("//li[@id='pim']");
	private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
	private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
	private final static By by_save = By.xpath("//input[@id='btnEdit']");
	private final static By by_back = By.xpath("//input[@class='backbutton']");
	private final static By by_empName = By.xpath("//a[contains(text(),'Sai')]");
	private final static By by_empedit=By.xpath("//a[contains(text(),'kalpana')]");
	private final static By by_chkbox = By.xpath("//input[@value='0036']");
	private final static By by_delete =By.xpath("//input[@value='Delete']");
	private final static By by_deletemsg =By.xpath("//span[@class='failure']");
	private final static By by_empphoto=By.xpath("//span[@id='empname']");
	private final static By by_choosefile = By.id("photofile");
	private final static By by_savephoto =By.xpath("//input[@onclick='addPic();']");
	
	// Getter/Setter Helping functions
	public static void clickOnElement() throws Exception {
		CommonUtils.clickElement(getPim());
	}
	
	public static By getPim() throws Exception {
		return by_pim;
	}
	
	public static By getAddEmp() throws Exception {
		return by_addEmp;
	}
	
	public static By getFirstName() throws Exception {
		return by_firstName;
	}
	
	public static By getLastName() throws Exception {
		return by_lastName;
	}
	
	public static By getFrame() throws Exception {
		return by_iframe;
	}
	
	public static By getSave() throws Exception {
		return by_save;
	}
	public static By getDelete() throws Exception {
		return by_delete;
	}
	public static By getDeleteMsg() throws Exception {
		return by_deletemsg;
	}
	
	public static By getBackButton() throws Exception {
		return by_back;
	}
	
	public static By getEmpName() throws Exception {
		return by_empName;
	}
	public static By getChkbox() throws Exception{
		return by_chkbox;
	}
	public static By getemp() throws Exception {
		return by_empedit;
	}
	public static By getempphoto() throws Exception {
		return by_empphoto;
	}
	public static By getChoosefile() throws Exception {
		return by_choosefile;
	}
	public static By getSavePhoto() throws Exception {
		return by_savephoto;
	}
	
	
}
