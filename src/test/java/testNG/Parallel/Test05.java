package testNG.Parallel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test05 extends TestBase{
 
    @Test
    public void testLink()throws Exception{
    	 System.out.println(this.getClass().getName()+"-"+Thread.currentThread().getId());
        getDriver().get("http://edition.cnn.com/");
        WebElement textBox = getDriver().findElement(By.id("search-button"));
        textBox.click();
        Thread.sleep(4000);
    }
}