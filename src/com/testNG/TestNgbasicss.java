package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgbasicss {
    @BeforeSuite
    public void launchB() {
		System.out.println("Launch chrome browser");
	}
	
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}
	@BeforeTest
	public void login() {
		System.out.println("Login method");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("enterUrl");
	}
	
	@Test
	public void googlrTitleTest() {
		System.out.println("Google Title Test");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("Logout from app");
	}
	@AfterTest
	public void deleteAllCookies() {
			System.out.println("delete All cookies");
		
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void launchBro() {
		System.out.println("Launch chrome browser");
	}
	}

