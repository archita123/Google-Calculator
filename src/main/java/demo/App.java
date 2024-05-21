package demo;
import java.net.MalformedURLException;


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


