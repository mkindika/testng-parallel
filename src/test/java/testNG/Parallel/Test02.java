package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test02 extends TestBase{
 
    @Test
    public void testLink()throws Exception{
        getDriver().get("https://twitter.com");
        System.out.println(this.getClass().getName()+"-"+Thread.currentThread().getId());
        WebElement textBox = getDriver().findElement(By.id("signin-email"));
        textBox.click();
        textBox.sendKeys("Just another test!");
        Thread.sleep(4000);
    }
 
}
