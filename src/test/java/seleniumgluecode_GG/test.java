package seleniumgluecode_GG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	public static WebDriver driver;
	String baseUrl="https://www.google.com/";
	WebElement element;
	
	@Given("ABRIR LA PAGINA DE GOOGLE")
	public void abrir_la_pagina_de_google() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
				driver = new ChromeDriver(option);
				driver.get(baseUrl);
			
			
				
	  
	}

	@When("CAPTURA MI BUSQUEDA")
	public void captura_mi_busqueda() {
	 
	driver.findElement(By.name("q")).click();	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("CAFE TALKS, ");

	}

	@Then("CIERRA EL NAVEGADOR")
	public void cierra_el_navegador() {
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.quit();
	}

}
