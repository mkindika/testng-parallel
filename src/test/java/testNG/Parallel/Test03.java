package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test03  extends TestBase{
 
    @Test
    public void testLink()throws Exception{
    	 System.out.println(this.getClass().getName()+"-"+Thread.currentThread().getId());
        getDriver().get("https://github.com/");
        WebElement textBox = getDriver().findElement(By.id("user[email]"));
        textBox.click();
        textBox.sendKeys("Test three!");
        Thread.sleep(4000);
    }
}