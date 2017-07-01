package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test01 extends TestBase{
 
    @Test
    public void testLink()throws Exception{
    	 System.out.println(this.getClass().getName()+"-"+Thread.currentThread().getId());
        getDriver().get("http://facebook.com");
        WebElement textBox = getDriver().findElement(By.name("firstname"));
        textBox.click();
        textBox.sendKeys("Just a test!");
      
        Thread.sleep(4000);
    }
}