import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.chrome.ChromeDriver; 
 
public class ExampleTitleScraper { 
	
	
	public void title() {
		// setting up the web driver 
		WebDriver driver = new ChromeDriver(); 
 
		// navigating to the website 
		driver.get("https://web.whatsapp.com/"); 
 
		// scraping the title of the website 
		String title = driver.getTitle(); 
		System.out.println("Website title: " + title); 
 
		// closing the web driver 
		driver.close(); 
	}
	
	
	public static void main(String[] args) { 
		ExampleTitleScraper obj = new ExampleTitleScraper();
		obj.title();

	} 
}
