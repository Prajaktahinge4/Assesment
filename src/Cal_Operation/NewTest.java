package Cal_Operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
    WebDriver dr;
    @Test(priority=1)
	void openUrl() {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		dr =new ChromeDriver();
		dr.get("https://www.calculator.net/");
		dr.manage().window().fullscreen();
	}
    @Test(priority=2)
	void Multiplication_Op() throws InterruptedException {
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'×')]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(3000);
	}
    @Test(priority=3)
	void Division_Op() throws InterruptedException {
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();

		
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(3000);

	}
    @Test(priority=4)
	void Addition_Op() throws InterruptedException {
		dr.findElement(By.xpath("//span[contains(text(),'–')]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(3000);

	}
    @Test(priority=5)
	void Substraction_Op() throws InterruptedException {
		
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'(')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),')')]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(3000);
		dr.close();
	}
	public static void main(String[] args) throws InterruptedException{
		NewTest obj = new NewTest();
		obj.openUrl();
		obj.Multiplication_Op();
		obj.Division_Op();
		obj.Addition_Op();
		obj.Substraction_Op();
	}
}
