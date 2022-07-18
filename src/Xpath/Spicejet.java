package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Spicejet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		FirefoxOptions option = new FirefoxOptions();
		option.addPreference("dom.webnotifications.enabled", false);
		option.addPreference("geo.enabled", false);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa' and text()='one way']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/descendant::div[@data-testid='to-testID-origin']/div[1]"));
		from.click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='BLR']")).click();
		WebElement to = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa' and text()='one way']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/descendant::div[@data-testid='to-testID-destination']"));
		to.click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='DEL']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-July-2022']/descendant::div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and text()='14']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

		String text = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
		
		
		if(text.contains("Select your Departure to Delhi"))
				{
			System.out.println("result verified and text displayed as "+ text);
		}
	}

}
