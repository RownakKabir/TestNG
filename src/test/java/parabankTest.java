import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class parabankTest {
@Test
public void checkTittle(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://parabank.parasoft.com/parabank/index.htm");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    Assert.assertEquals(driver.getTitle(),"ParaBank | Welcome | Online Banking");

    driver.quit();

}
@Test
public  void loginFail(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://parabank.parasoft.com/parabank/index.htm");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.name("username")).sendKeys("twjh");
    driver.findElement(By.name("password")).sendKeys("erj231");
    driver.findElement(By.cssSelector("input[type='submit']")).click();
    int count = driver.findElements(By.className("error")).size();
    Assert.assertEquals(1,count);
    driver.quit();



}
@Test
public void loginSuccessfull(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://parabank.parasoft.com/parabank/index.htm");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.name("username")).sendKeys("sqa");
    driver.findElement(By.name("password")).sendKeys("sqa");
    driver.findElement(By.cssSelector("input[type='submit']")).click();
    int count1 = driver.findElements(By.linkText("Log Out")).size();
    Assert.assertEquals(1,count1);
    driver.quit();


}


}
