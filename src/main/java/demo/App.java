package demo;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
 public void getGreeting() throws InterruptedException{

        TestCases tests = new TestCases();

        tests.testCase01();
        tests.testCase02();
        tests.testCase03();
        tests.testCase04();

        tests.endTest(); 
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
         
        new App().getGreeting();
        
        
    }
}


