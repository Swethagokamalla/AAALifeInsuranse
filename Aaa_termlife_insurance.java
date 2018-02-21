import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class TermlifePage {
    public static void main(String[] args){
          webDriver driver = new FirefoxDriver();
          driver.navigate().to("https://www.aaalife.com/term-life-insurance-quote-input");
          driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("48335");
          select drpgender = new select(driver.findElement(By.name("gender")));
          drpgender.selectByVisibleText("Female");
          select drpmonth = new select(driver.findElement(By.name("month")));
          drpmonth.selectByVisibleText("August");
          select drpday = new select(driver.findElement(By.name("day")));
          drpmonth.selectByVisibleText("2");
          select drpyear = new select(driver.findElement(By.name("year")));
          drpmonth.selectByVisibleText("1989");
          WebElement radioBtn = driver.findElement(By.id("isMemberNo"));
          radioBtn.click();
          driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys("test@gmail.com");
          select drpfeet = new select(driver.findElement(By.name("feet")));
          drpfeet.selectByVisibleText("5");
          select drpfeet = new select(driver.findElement(By.name("inches")));
          drpfeet.selectByVisibleText("4");
          driver.findElement(By.xpath("//input[@id='weight']")).sendKeys("140");
          WebElement nicotinradioBtn = driver.findElement(By.id("nicotineUseNo"));
          nicotinradioBtn.click();
          select amount = new select(driver.findElement(By.name("coverageAmount")));
          amount.selectByVisibleText("$500000");
          select termlength = new select(driver.findElement(By.name("termLength")));
          termlength.selectByVisibleText("10");      
          
}
}