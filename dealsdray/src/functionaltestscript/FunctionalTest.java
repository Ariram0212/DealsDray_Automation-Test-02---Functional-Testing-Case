package functionaltestscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;

public class FunctionalTest extends BaseClass {	
	@Test
	public void task() throws AWTException, InterruptedException, IOException
	{
		driver.findElement(By.xpath("//span[@class='material-icons notranslate MuiIcon-root MuiIcon-fontSizeSmall css-va0op3']")).click();
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		driver.findElement(By.xpath("//div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-uodm64']")).click();
		StringSelection file=new StringSelection("C:\\Users\\srsar\\Downloads\\demo-data.xlsx");
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(file, null);
		Robot citi=new Robot();
		citi.keyPress(KeyEvent.VK_CONTROL);
		citi.keyPress(KeyEvent.VK_V);
		citi.keyRelease(KeyEvent.VK_CONTROL);
		citi.keyRelease(KeyEvent.VK_V);
		citi.keyPress(KeyEvent.VK_ENTER);
		citi.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert(); 
		alt.accept();
		Thread.sleep(3000);
		//File ss=ts.getScreenshotAs(OutputType.FILE); 
		//File path=new File("./screenshot/ss.png");
		//FileHandler.copy(ss, path);
		Reporter.log("Task completed Successfully", true);
	}
}
