import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestusingClass extends BaseClass{
    @Test
    public void checkTittle() {
        Assert.assertEquals(driver.getTitle(), "ParaBank | Welcome | Online Banking");


    }
    @Test
    public  void loginFail(){

        driver.findElement(By.name("username")).sendKeys("twjh");
        driver.findElement(By.name("password")).sendKeys("erj231");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        int count = driver.findElements(By.className("error")).size();
        Assert.assertEquals(1,count);




    }
    @Test
    public void loginSuccessfull(){

        driver.findElement(By.name("username")).sendKeys("sqa");
        driver.findElement(By.name("password")).sendKeys("sqa");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        int count1 = driver.findElements(By.linkText("Log Out")).size();
        Assert.assertEquals(1,count1);



    }
}
