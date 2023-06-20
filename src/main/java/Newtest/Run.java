package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Run extends BaseDriver{
	
	
     @Test
	public void firstTest() throws InterruptedException{
		
		driver.get("https://www.tribel.com/signup");

		driver.manage().window().maximize();

		Thread.sleep(8000);

		WebElement button = driver.findElement(By.className("accept_btn"));
		button.click();

		Thread.sleep(7000);
		
        //first name
		WebElement firstname = driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[5]/div[1]/input[1]"));
		firstname.sendKeys("Disha");
		Thread.sleep(5000);
		
		//match with attribute
		WebElement firstattribute = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[5]/div[1]/input[1]"));
		System.out.println("Attribute Value: "+firstattribute.getAttribute("placeholder"));
		Thread.sleep(5000);
		
        //last name
		WebElement lastname = driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[5]/div[2]/input[1]"));
		lastname.sendKeys("Sheikh");

		Thread.sleep(5000);
		
		//email
		WebElement email = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[6]/input[1]"));
		email.sendKeys("no@email.com");
		
	    Thread.sleep(5000);
	    
	    //confirm email
	    WebElement confirmEmail = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[7]/input[1]"));
	    confirmEmail.sendKeys("no@email.com");
	    
	    Thread.sleep(5000);
	    
	    //password
	    WebElement password = driver.findElement(By.xpath("//input[@id='signuppass']"));
	    password.sendKeys("Tribel@2022");
	    
	    Thread.sleep(5000);
	    
	  //confirm password
	    WebElement confirmPassword = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[9]/input[1]"));
	    confirmPassword.sendKeys("Tribel@2022");
	    
	    Thread.sleep(5000);
	    
	  //click sign up
	    WebElement clickSignup = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/input[1]"));
	    clickSignup.click();
	    
	    Thread.sleep(5000);
	    
	    //to see any text -> getText() method will be used
	    
	    //to check selected or not
	    WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	    
	    if(!gender.isSelected()) {
	    	gender.click();
	    	Thread.sleep(5000);}
	    	
	    	else {
	    		System.out.println("Female is selected");
	    	}
	    
	    WebElement date = driver.findElement(By.name("day"));
	    Select select = new Select(date);
	    
	    select.selectByValue("11");
	    
	    
	    WebElement month = driver.findElement(By.name("month"));
	    Select sel = new Select(month);
	    
	    sel.selectByVisibleText("July");
	    
	    Thread.sleep(5000);
	    
	    WebElement year = driver.findElement(By.name("year"));
	    Select drop = new Select(year);
	    
	    drop.selectByIndex(1);
	    
	    WebElement country = driver.findElement(By.name("country"));
	    Select dropdown = new Select(country);
	    
	    dropdown.selectByVisibleText("Albania");
	    
	    WebElement state = driver.findElement(By.name("city"));
	    Select newstate = new Select(state);
	    
	    newstate.selectByVisibleText("Dibre");
	    Thread.sleep(5000);
	    
	    WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Finish')]"));
	    btn.click();
	    	    	
	    	    	
	    }
	    
     }
     

