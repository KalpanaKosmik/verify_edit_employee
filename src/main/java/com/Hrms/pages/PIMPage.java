package com.Hrms.pages;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;

public class PIMPage{
	// Web locators

	private final static By by_pim = By.xpath("//li[@id='pim']");
	private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
	private final static By by_middlename=By.xpath("//input[@name='txtEmpMiddleName']");
	private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
	private final static By by_save = By.xpath("//input[@id='btnEdit']");
	private final static By by_back = By.xpath("//input[@class='backbutton']");
	private final static By by_empName = By.xpath("//a[contains(text(),'Sai')]");
	private final static By by_dropdown=By.xpath("//select[@id='loc_code']");
	private final static By by_searchbox=By.xpath("//input[@id='loc_name']");
	private final static By by_search=By.xpath("//input[@type='button']");
	private final static By by_empedit=By.xpath("//a[contains(text(),'kalpana')]");
	private final static By by_iframe1 = By.xpath("//iframe[@id='_yuiResizeMonitor']");
	private final static By by_editbutton=By.xpath("//input[@class='editbutton']");
	private final static By by_editsave=By.xpath("//input[@name='EditMain']");
	private final static By by_edit=By.xpath("//a[contains(text(),'ashok')]");
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
	public static By getMiddleName() throws Exception {
		return by_middlename;
	}
	
	public static By getFrame() throws Exception {
		return by_iframe;
	}
	
	public static By getSave() throws Exception {
		return by_save;
	}
	public static By getEditSave() throws Exception {
		return by_editsave;
	}
	
	public static By getBackButton() throws Exception {
		return by_back;
	}
	
	public static By getEmpName() throws Exception {
		return by_empName;
	}
	
	public static By getDropdown() throws Exception {
		return by_dropdown;
	}
	public static By getSearchbox() throws Exception {
		return by_searchbox;
	}
	public static By getsearch() throws Exception {
		return by_search;
	}
	public static By getemp() throws Exception {
		return by_empedit;
	}
	public static By getFrame1() throws Exception {
		return by_iframe1;
	}

	public static By getEditbutton() throws Exception {
		return by_editbutton;
	}
	public static By getEditdetails() throws Exception {
		return by_edit;
	}

}
