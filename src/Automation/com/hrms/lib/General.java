package Automation.com.hrms.lib;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Automation.com.hrms.utility.Log;

public class General extends Global {
	// To provide all re-usable functions:/methods related to whole application
	public void openApplication() {
		driver.navigate().to(url);
		System.out.println("Application Opened"); // Java-console
		Reporter.log("Application Opened"); // TestNG-htmlReport
		Log.info("Application Opened"); // Log4j-logfile
	}

	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application Closed");
	}

	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}

	public void enterFrame() {
		driver.switchTo().frame(EmpInf_frame);
		System.out.println("Enter into frame");
		Log.info("Enter frame");
	}

	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
		Log.info("Exit frame");
	}

	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("NewEmpAdded");
		Log.info("newempadded");
	}
}
