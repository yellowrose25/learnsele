package newpackage;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MyClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I349534\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait myWaitVar = new WebDriverWait(driver,10);
		
//		String baseUrl = "https://e-space.vn";
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
/*		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("loginform-email")).sendKeys("unggiadrive@gmail.com");
		driver.findElement(By.id("loginform-password")).sendKeys("50700439");
		driver.findElement(By.id("loginform-password")).submit();
		*/
		driver.manage().window().maximize();
		WebElement homelink = driver.findElement(By.linkText("Home"));
		WebElement icon_homelink = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		Actions builder = new Actions(driver);
		String bgColor = icon_homelink.getCssValue("background-color");
		System.out.println(bgColor);
		
		Action moveOverHome = builder.moveToElement(homelink).build();
		moveOverHome.perform();
		bgColor = icon_homelink.getCssValue("background-color");
		System.out.println(bgColor);
		
		WebElement userName = driver.findElement(By.name("userName")); 
		Action seriesPerformKeyboard = builder.moveToElement(userName).click().keyDown(userName, Keys.SHIFT).sendKeys("quynh").keyDown(userName, Keys.SHIFT).doubleClick().contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build();
		seriesPerformKeyboard.perform();
		
		

		
        
/*		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		*/
/*		List<WebElement> listweb = driver.findElements(By.tagName("a"));
		String[] listtext = new String[listweb.size()];
		
		int i=0;
		for(WebElement e:listweb) {
			listtext[i]=e.getText();
			i++;
		}
		
		for(String t:listtext) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals("underConsTitle")) {
				System.out.println("\"" + t + "\""								
                        + " is under construction.");
			}
			else {
				System.out.println("\"" + t + "\""								
                        + " is working.");
			}
			driver.navigate().back();
		}
		
		*/
		
/*		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/trang-ca-nhan']")));
		driver.findElement(By.xpath("//a[@href='/trang-ca-nhan']")).click();
		
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/dat-lich-hoc']")));
		driver.findElement(By.xpath("//a[@href='/dat-lich-hoc']")).click();
		*/

/*		String baseUrl = "http://output.jsbin.com/usidix/1";
		driver.get(baseUrl);

		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		*/

	}

}
