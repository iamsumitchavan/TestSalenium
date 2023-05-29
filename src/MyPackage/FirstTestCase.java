package MyPackage;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement inp_name = driver.findElement(By.xpath(".//[text() = 'email']"));
		
		String res = (inp_name.isDisplayed()) ? "input is present" : "input is not present";
		
		System.out.println(res);

	}

}
