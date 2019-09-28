package com.nagarro.autothon.movierentalservice.webpages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MovieRentalHomePage {
	
public static final Logger log = Logger.getLogger(MovieRentalHomePage.class.getName());
	
	@FindBy(name="Login")
	WebElement login;
	
	@FindBy(xpath="//input[@name=\"username\"]" )
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]" )
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"main\"]/span/div/div/ul/li[2]/div/div/div/button" )
	WebElement btn;
	
	public MovieRentalHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user,String pass,int typeOfUser) {
		
		String text="";
		log.info("username");
	    username.sendKeys(user); 
	    
	    log.info("Enter Password");
	    password.sendKeys(pass);
	    
	    btn.click();
	    log.info("Clicked on Login Button");
	    
	    
	   
	    
	}

}
