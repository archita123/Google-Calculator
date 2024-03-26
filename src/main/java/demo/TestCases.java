package demo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases{
   public WebDriver driver;
    public void Testcases(WebDriver driver) {
      this.driver = driver;
  }

    public TestCases(){
    
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();
        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);
        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");
        driver = new ChromeDriver(options);
        // Set browser to maximize and wait
        driver.manage().window().maximize();


    }

    public void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");

         driver.get("https://www.google.com/search?q=calculator&oq=calculator&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIMCAEQABhDGIAEGIoFMgwIAhAAGEMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPTIGCAcQRRg80gEIOTQ4MGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
        
          Thread.sleep(2000);
          
         if(driver.getCurrentUrl().contains("google.com/")){
              System.out.println("This Script Passed ");
         }else{
            
              System.out.println("This Script not Passed ");
         }
          
        //   Alert alert = driver.switchTo().alert();
        //  alert.dismiss();
        //  WebElement popupClose = driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']"));
        //  popupClose.click();

        // Type "calculator" in the Google search bar and press Enter.
        Thread.sleep(3000);
        // WebElement searchBox = driver.findElement(By.id("APjFqb"));        
        // searchBox.sendKeys("Calculator");

        // Verify that the Google Calculator loads.
        WebElement calendarLoads = driver.findElement(By.xpath("//span[@class='XDTKBd z1asCe dAmgBb']"));
        calendarLoads.isDisplayed();
        
        // Confirm that the initial display shows zero(0).
        WebElement inidisZero = driver.findElement(By.xpath("//span[text()='0']"));
        System.out.println("Initial display shows zero :" + inidisZero.getText());

    //    System.out.println("Getting current google url :" + pageUrl());

        System.out.println("End Test case: TestCase01 is completed");
    }

    // TestCase02: Verify Addition and Subtraction Operations
    public  void testCase02() throws InterruptedException{
        
    System.out.println("Start Test case: TestCase02 Started :");
        
    driver.get("https://www.google.com/search?q=calculator&oq=calculator&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIMCAEQABhDGIAEGIoFMgwIAhAAGEMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPTIGCAcQRRg80gEIOTQ4MGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");

    // Perform an addition operation, 5 + 7.
       driver.findElement(By.xpath("//div[text()='5']")).click();
       driver.findElement(By.xpath("//div[text()='+']")).click();
       driver.findElement(By.xpath("//div[text()='7']")).click();
       driver.findElement(By.xpath("//div[text()='='] ")).click();

       Thread.sleep(3000);
    // Confirm that the displayed result is correct (in this case, 12).
      WebElement Result1 =driver.findElement(By.id("cwos"));
       System.out.println("Addition of 5 + 7 :" + Result1.getText());

       driver.findElement(By.xpath("//div[text()='AC']")).click();
     // Perform a subtraction operation, 15 - 8.
      Thread.sleep(3000);
      driver.findElement(By.xpath("//div[text()='1']")).click();
      driver.findElement(By.xpath("//div[text()='5']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@aria-label='minus']")).click();
      driver.findElement(By.xpath("//div[text()='8']")).click();
      driver.findElement(By.xpath("//div[text()='='] ")).click();

    // Thread.sleep(3000);

    // Confirm that the displayed result is correct (in this case, 7).
     WebElement Result2 =driver.findElement(By.id("cwos"));
     System.out.println("Substraction of 15-8 is :" + Result2.getText());

     System.out.println("End Test case: TestCase02 is completed successfully");

    }

    // TestCase03: Verify the Functionality of the All Clear (AC) Button and Multiplication Operation
    public  void testCase03() throws InterruptedException{
        
    System.out.println("Start Test case: TestCase03 Started :");

    driver.get("https://www.google.com/search?q=calculator&oq=calculator&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIMCAEQABhDGIAEGIoFMgwIAhAAGEMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPTIGCAcQRRg80gEIOTQ4MGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");

    // Perform a multiplication operation, 10 * 3.
          driver.findElement(By.xpath("//div[text()='1']")).click();
          driver.findElement(By.xpath("//div[text()='0']")).click();
          driver.findElement(By.xpath("//div[@aria-label='multiply']")).click();
          driver.findElement(By.xpath("//div[text()='3']")).click();
          driver.findElement(By.xpath("//div[text()='=']")).click();
    
          Thread.sleep(3000);

    // Confirm that the displayed result is correct (in this case, 30).
        WebElement Result3 =driver.findElement(By.id("cwos"));
        System.out.println("Multiplication of 10 * 3 is :" + Result3.getText());

    // Click the "AC" (All Clear) button on the calculator.
         driver.findElement(By.xpath("//div[text()='AC']")).click();

     // Verify that the display clears.
       WebElement disClear = driver.findElement(By.xpath("//span[text()='0']"));
        System.out.println("Display is clear and has 0 data :" + disClear.getText());;
      
      System.out.println("End Test case: TestCase03 is completed successfully");
    }
     // TestCase04: Verify Division Operation
    // **Description: **Verify that the Google Calculator can perform division correctly.

    public  void testCase04() throws InterruptedException{
        
      System.out.println("Start Test case: TestCase04 Started :");

      driver.get("https://www.google.com/search?q=calculator&oq=calculator&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIMCAEQABhDGIAEGIoFMgwIAhAAGEMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPTIGCAcQRRg80gEIOTQ4MGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
      
    //   Perform a division operation, 20 / 4.
       driver.findElement(By.xpath("//div[text()='2']")).click();
       driver.findElement(By.xpath("//div[text()='0']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@aria-label='divide']")).click();
       driver.findElement(By.xpath("//div[text()='4']")).click();
       driver.findElement(By.xpath("//div[text()='=']")).click();

    //   Confirm that the displayed result is correct (in this case, 5).
         WebElement Result4 =driver.findElement(By.id("cwos"));
        System.out.println("Division of 20 / 4 is :" + Result4.getText());
      
      System.out.println("End Test case: TestCase04 is completed successfully");
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

}


 // public static WebDriver createDriver() throws MalformedURLException {
    //     ChromeOptions options = new ChromeOptions();
    //     driver = new ChromeDriver(options);
		//     WebDriverManager.chromedriver().setup();
    //     driver.manage().window().maximize();

    //     return driver;
    // }
