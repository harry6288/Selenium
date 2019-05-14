import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

		

public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// Windows
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		// 1. Configure Selenium to talk to Chrome
		System.setProperty("webdriver.chrome.driver","/Users/hardeepkaur/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// 2. Enter the website you want to go to
		String baseUrl = "https://www.facebook.com/login/";
		
		// 3. Open Chrome and go to the base url;
		driver.get(baseUrl);
	
		// 4. Close the browser
		Thread.sleep(3000);  //pause for 1 second before closing the browser
		driver.close();
		
		
		
		// get the actual value of the title
//		actualTitle = driver.getTitle();
//		System.out.println("Title of webpage: " + actualTitle);
		

				
		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
//		if (actualTitle.contentEquals(expectedTitle)){
//		    System.out.println("Test Passed!");
//		} else {
//		    System.out.println("Test Failed");
//		    }
//		   
//		    //close Chrome
		   // driver.close();
		   
	}
}
