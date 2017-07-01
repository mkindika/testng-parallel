package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test04  extends TestBase{
 
    @Test
    public void testLink()throws Exception{
    	 System.out.println(this.getClass().getName()+"-"+Thread.currentThread().getId());
        getDriver().get("http://www.bbc.com/news");
        WebElement textBox = getDriver().findElement(By.id("orb-search-q"));
        textBox.click();
        textBox.sendKeys("Test 4!");
       
        Thread.sleep(4000);
    }
}