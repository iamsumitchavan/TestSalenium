package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Finding_rating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=12261610120074600466&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
		
		Thread.sleep(3000);
		
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.className("nav-input")).submit();
	  
	  Thread.sleep(3000);
	  
	  List<WebElement> element = driver.findElements(By.xpath(".//span[@class = 'a-icon-alt']"));
	  
	  for(WebElement rating : element) {
		  
		  String r = rating.getText();
		  
		  System.out.println(r);
	  }
	  
	  
		
		

	}

}
