import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dell on 2017/3/1.
 */
public class SeleniumExample {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        //     WebDriver driver = new ChromeDriver();


        driver.get("http://192.168.0.120:8081");
        //打开网址域名
        //WebElement element = driver.findElement(By.xpath("//*[@id='Account']"));
        WebElement loginInput = driver.findElement(By.xpath("//*[@id='Account']"));

        loginInput.sendKeys("hg4088");
        //获取账号的元素并赋值
        loginInput=driver.findElement(By.id("Password"));

        //WebElement element = driver.findElement(By.xpath("//*[@id='Password']"));



       /// WebElement pwdInput = driver.findElement(By.xpath("//input[@id='Password']"));
        //element.sendKeys("password=aaa222");
        loginInput.sendKeys("aaa222");
        // 获取密码的元素并赋值


      Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btn-submit']"));
        loginBtn.click();
         //点击login登录
        //WebElement quicklyBtn = driver.findElement(By.xpath("//*[@id='btn_quickly']"));
        //quicklyBtn.click();
        //点击快速进入登录
        Thread.sleep(2000);
        WebElement agreeBtn = driver.findElement(By.xpath("//*[@id='agree']"));
        agreeBtn.click();
        //点击同意登录

    }
}