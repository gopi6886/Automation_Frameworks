package Automation.com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Global 
{
	WebDriver driver = new FirefoxDriver();
  //To provide TestData & objects related to whole application
  //************TestData
  //        DT    VAR     VV
	public String url = "http://183.82.103.245/nareshit/index.php";
	public String un =  "nareshit";
	public String pw = "nareshit";
	public String FN = "JR";
	public String LN = "NTR";
	
	//**********Objects/Element
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";
	public String EmpInf_frame  = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String txt_EFN       = "txtEmpFirstName";
	public String txt_ELN       = "txtEmpLastName";
	public String btn_Save      = "btnEdit";
}
